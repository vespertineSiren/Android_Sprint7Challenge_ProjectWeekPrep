package com.fatehistory.patrickjmartin.fatehistory.HistoryAPI;

public class WikipediaDAO {

    private static String BASE_IMAGE_URL =
            "https://en.wikipedia.org/w/api.php?action=query&prop=pageimages&format=json&piprop=original&titles=";

    private static final String HISTORICAL_IMAGE_URL = BASE_IMAGE_URL + "%d";

    //Might not need this since BASE_BIOGRAPHY_URL provides tags
    private static String BASE_INFOBOX_URL =
            "https://en.wikipedia.org/w/api.php?format=json&action=query&prop=extracts&exintro&explaintext&redirects=1&titles=";

    private static final String HISTORICAL_INFBOX_URL = BASE_INFOBOX_URL + "%d";

    private static String BASE_BIOGRAPHY_URL =
            "https://en.wikipedia.org/w/api.php?action=query&prop=revisions&rvprop=content&format=json&rvsection=0&rvslots=main&titles=";

    private static final String HISTORICAL_BIORGRAPHY_URL = BASE_BIOGRAPHY_URL + "%d";





}
