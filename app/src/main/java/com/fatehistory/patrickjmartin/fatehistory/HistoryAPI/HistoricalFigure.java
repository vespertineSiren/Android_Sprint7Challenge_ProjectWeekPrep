package com.fatehistory.patrickjmartin.fatehistory.HistoryAPI;

import java.io.Serializable;


public class HistoricalFigure implements Serializable {
    private String fateName, fateBio, fateImageURL, realName, realBio, realImageURL, realFlavorText;

    public HistoricalFigure(String fateName, String fateBio, String fateImageURL, String realName, String realBio, String realImageURL, String realFlavorText) {
        this.fateName = fateName;
        this.fateBio = fateBio;
        this.fateImageURL = fateImageURL;
        this.realName = realName;
        this.realBio = realBio;
        this.realImageURL = realImageURL;
        this.realFlavorText = realFlavorText;
    }

    public String getFateName() {
        return fateName;
    }

    public void setFateName(String fateName) {
        this.fateName = fateName;
    }

    public String getFateBio() {
        return fateBio;
    }

    public void setFateBio(String fateBio) {
        this.fateBio = fateBio;
    }

    public String getFateImageURL() {
        return fateImageURL;
    }

    public void setFateImageURL(String fateImageURL) {
        this.fateImageURL = fateImageURL;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getRealBio() {
        return realBio;
    }

    public void setRealBio(String realBio) {
        this.realBio = realBio;
    }

    public String getRealImageURL() {
        return realImageURL;
    }

    public void setRealImageURL(String realImageURL) {
        this.realImageURL = realImageURL;
    }

    public String getRealFlavorText() {
        return realFlavorText;
    }

    public void setRealFlavorText(String realFlavorText) {
        this.realFlavorText = realFlavorText;
    }
}
