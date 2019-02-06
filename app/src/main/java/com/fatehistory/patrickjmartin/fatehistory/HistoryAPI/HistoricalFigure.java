package com.fatehistory.patrickjmartin.fatehistory.HistoryAPI;

import android.text.TextUtils;

import org.json.JSONObject;

import java.util.HashMap;

public class HistoricalFigure {
    private String  fateAlias, fateDefaultBio, fateAligment, fateSource, fateCountry, fateGender, fateMiniBio, fateImageKey,
            realName, realDefaultBio, realImageURL;

    private Integer fateHeight, fateWeight, wikiPageID;



    public HistoricalFigure(JSONObject fateJSON, JSONObject realLongBioJSON, JSONObject realInfoBoxJSON) {

    }



    public String getFateAlias() {
        return fateAlias;
    }

    public String getFateDefaultBio() {
        return fateDefaultBio;
    }

    public String getFateAligment() {
        return fateAligment;
    }

    public String getFateSource() {
        return fateSource;
    }

    public String getFateCountry() {
        return fateCountry;
    }

    public String getFateGender() {
        return fateGender;
    }

    public String getFateMiniBio() {
        return fateMiniBio;
    }

    public String getRealName() {
        return realName;
    }



    public Integer getFateHeight() {
        return fateHeight;
    }

    public Integer getFateWeight() {
        return fateWeight;
    }
}
