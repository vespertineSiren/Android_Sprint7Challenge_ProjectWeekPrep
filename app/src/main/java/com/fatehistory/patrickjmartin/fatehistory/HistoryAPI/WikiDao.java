package com.fatehistory.patrickjmartin.fatehistory.HistoryAPI;

import com.fatehistory.patrickjmartin.fatehistory.HistoryAPI.Fate.Fate;
import com.fatehistory.patrickjmartin.fatehistory.HistoryAPI.Fate.Image;
import com.fatehistory.patrickjmartin.fatehistory.HistoryAPI.FateImages.FateImages;
import com.fatehistory.patrickjmartin.fatehistory.HistoryAPI.History.History;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

public class WikiDao {

    private static String BASE_FATE_BIO_URL =
            "https://typemoon.fandom.com/api/v1/Articles/AsSimpleJson?id=";

    private static final String FATE_BIO_URL = BASE_FATE_BIO_URL;

    private static String BASE_FATE_IMAGE_URL =
            "https://typemoon.fandom.com/api.php?action=query&format=json&list=allimages&aisort=name&aifrom=";

    private static final String FATE_IMAGES_URL = BASE_FATE_IMAGE_URL;

    //Might not need this since BASE_BIOGRAPHY_URL provides tags
    private static String BASE_INFOBOX_URL =
            "https://en.wikipedia.org/api/rest_v1/page/summary/";

    private static final String HISTORICAL_INFOBOX_URL = BASE_INFOBOX_URL ;

//    private static String BASE_IMAGE_URL =
//            "https://en.wikipedia.org/w/api.php?action=query&prop=pageimages&format=json&piprop=original&titles=";
//
//    private static final String HISTORICAL_IMAGE_URL = BASE_IMAGE_URL + "%d";

    public static HistoricalFigure getFateRealBio(String wikipediaID, String fandomID, String fateImageID) {

        HistoricalFigure selectedFigure = null;

        JSONObject realTopLevel = null;
        JSONObject fateTopLevel = null;
        JSONObject fateImageTopLevel = null;

        Gson gson = new Gson();

        String realBioURL = HISTORICAL_INFOBOX_URL + wikipediaID;
        String fateBioURL = FATE_BIO_URL + fandomID;
        String fateImageURL = FATE_IMAGES_URL + fateImageID;

        final String realResult = NetworkAdapter.httpRequest(realBioURL, NetworkAdapter.GET);
        final String fateResult = NetworkAdapter.httpRequest(fateBioURL, NetworkAdapter.GET);
        final String fateImageResult = NetworkAdapter.httpRequest(fateImageURL, NetworkAdapter.GET);

        try {
            realTopLevel = new JSONObject(realResult);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        try {
            fateTopLevel = new JSONObject(fateResult);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        try {
            fateImageTopLevel = new JSONObject(fateImageResult);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        Fate gsonFate = gson.fromJson(fateTopLevel.toString(), Fate.class);
        History gsonHistory = gson.fromJson(realTopLevel.toString(), History.class);
        FateImages gsonFateImage = gson.fromJson(fateImageTopLevel.toString(), FateImages.class);

        selectedFigure = new HistoricalFigure(gsonHistory, gsonFate, gsonFateImage, fateImageID);

        return selectedFigure;
    }



}
