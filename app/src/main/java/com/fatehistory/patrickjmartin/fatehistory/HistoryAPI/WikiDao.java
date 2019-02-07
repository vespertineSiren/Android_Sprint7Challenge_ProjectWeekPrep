package com.fatehistory.patrickjmartin.fatehistory.HistoryAPI;

import com.fatehistory.patrickjmartin.fatehistory.HistoryAPI.Fate.Fate;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import org.json.JSONException;
import org.json.JSONObject;

public class WikiDao {

    private static String BASE_FATE_BIO_URL =
            "https://typemoon.fandom.com/api/v1/Articles/AsSimpleJson?id=";

    private static final String FATE_BIO_URL = BASE_FATE_BIO_URL;

    private static String BASE_FATE_IMAGE_URL =
            "https://typemoon.fandom.com/api.php?action=query&format=json&list=allimages&aisort=name&aifrom=";

    private static final String FATE_IMAGES_URL = BASE_FATE_IMAGE_URL + "%d";

    //Might not need this since BASE_BIOGRAPHY_URL provides tags
    private static String BASE_INFOBOX_URL =
            "https://en.wikipedia.org/api/rest_v1/page/summary/";

    private static final String HISTORICAL_INFOBOX_URL = BASE_INFOBOX_URL ;

//    private static String BASE_IMAGE_URL =
//            "https://en.wikipedia.org/w/api.php?action=query&prop=pageimages&format=json&piprop=original&titles=";
//
//    private static final String HISTORICAL_IMAGE_URL = BASE_IMAGE_URL + "%d";

    public static HistoricalFigure getFateRealBio(String wikipediaID, String fandomID) {
        Gson gson = new Gson();


        HistoricalFigure selectedFigure = null;


        String fateBioURL = FATE_BIO_URL + fandomID;
        String realBioURL = HISTORICAL_INFOBOX_URL + wikipediaID;

        final String fateResult = NetworkAdapter.httpRequest(fateBioURL, NetworkAdapter.GET);
        final String realResult = NetworkAdapter.httpRequest(realBioURL, NetworkAdapter.GET);

        JSONObject fateTopLevel = null;
        JSONObject realTopLevel = null;

        try {
            fateTopLevel = new JSONObject(fateResult);
            realTopLevel = new JSONObject(realResult);


        } catch (JSONException e) {
            e.printStackTrace();
        }

        Fate gsonFate = gson.fromJson(fateTopLevel.toString(), Fate.class);



        return selectedFigure;
    }



}
