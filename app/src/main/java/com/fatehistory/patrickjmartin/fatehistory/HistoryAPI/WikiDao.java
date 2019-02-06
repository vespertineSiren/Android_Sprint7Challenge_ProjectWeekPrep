package com.fatehistory.patrickjmartin.fatehistory.HistoryAPI;

public class WikiDao {

    private static String BASE_FATE_BIO_URL =
            "https://fategrandorder.fandom.com/api.php?action=query&prop=revisions&rvprop=content&format=json&titles=";

    private static final String FATE_BIO_URL = BASE_FATE_BIO_URL + "%d";

    private static String BASE_FATE_IMAGE_URL =
            "https://fategrandorder.fandom.com/api.php?action=query&format=json&list=allimages&aisort=name&aifrom=";

    private static final String FATE_IMAGES_URL = BASE_FATE_IMAGE_URL + "%d";

    //Might not need this since BASE_BIOGRAPHY_URL provides tags
    private static String BASE_INFOBOX_URL =
            "https://en.wikipedia.org/api/rest_v1/page/summary/";

    private static final String HISTORICAL_INFBOX_URL = BASE_INFOBOX_URL + "%d";

    private static String BASE_IMAGE_URL =
            "https://en.wikipedia.org/w/api.php?action=query&prop=pageimages&format=json&piprop=original&titles=";

    private static final String HISTORICAL_IMAGE_URL = BASE_IMAGE_URL + "%d";

//    public static HistoricalFigure getFateRealBio(String fandomID, String wikipediaID) {
//
//
//        return void;
//    }



}
