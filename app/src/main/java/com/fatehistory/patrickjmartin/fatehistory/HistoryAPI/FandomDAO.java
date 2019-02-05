package com.fatehistory.patrickjmartin.fatehistory.HistoryAPI;

public class FandomDAO {

    private static String BASE_BIO_URL =
            "https://fategrandorder.fandom.com/api.php?action=query&prop=revisions&rvprop=content&format=json&titles=";

    private static final String FATE_BIO_URL = BASE_BIO_URL + "%d";

    private static String BASE_IMAGE_URL =
            "https://fategrandorder.fandom.com/api.php?action=query&format=json&list=allimages&aisort=name&aifrom=";

    //Grabbing this will return an array.
    private static final String FATE_IMAGES_URL = BASE_IMAGE_URL + "%d";


}
