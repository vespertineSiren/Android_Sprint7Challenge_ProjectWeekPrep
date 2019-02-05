package com.fatehistory.patrickjmartin.fatehistory.HistoryAPI;

import java.util.HashMap;

public class HistoricalFigure {
    private String  fateAlias, fateDefaultBio, fateAligment, fateSource, fateCountry, fateGender, fateMiniBio,realName,
        realLongBio;

    private Integer fateHeight, fateWeight;

     private HashMap<String, String> realInfoBox;

    public HistoricalFigure(String fateAlias, String fateDefaultBio, String fateAligment,
                            String fateSource, String fateCountry, String fateGender,
                            String fateMiniBio, String realName, String realLongBio,
                            Integer fateHeight, Integer fateWeight) {
        this.fateAlias = fateAlias;
        this.fateDefaultBio = fateDefaultBio;
        this.fateAligment = fateAligment;
        this.fateSource = fateSource;
        this.fateCountry = fateCountry;
        this.fateGender = fateGender;
        this.fateMiniBio = fateMiniBio;
        this.realName = realName;
        this.realLongBio = realLongBio;
        this.fateHeight = fateHeight;
        this.fateWeight = fateWeight;
        this.realInfoBox = new HashMap<>();
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

    public String getRealLongBio() {
        return realLongBio;
    }

    public Integer getFateHeight() {
        return fateHeight;
    }

    public Integer getFateWeight() {
        return fateWeight;
    }
}
