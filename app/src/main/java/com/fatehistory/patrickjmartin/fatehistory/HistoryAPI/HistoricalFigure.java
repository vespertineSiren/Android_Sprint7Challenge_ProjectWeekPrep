package com.fatehistory.patrickjmartin.fatehistory.HistoryAPI;

import com.fatehistory.patrickjmartin.fatehistory.HistoryAPI.Fate.Fate;
import com.fatehistory.patrickjmartin.fatehistory.HistoryAPI.FateImages.FateImages;
import com.fatehistory.patrickjmartin.fatehistory.HistoryAPI.History.History;

import java.io.Serializable;
import java.util.Objects;


public class HistoricalFigure implements Serializable {
    private String realName, realBio, realImageURL, realFlavorText, fateName, fateBio, fateImageURL;

    public HistoricalFigure() {

    }

    public HistoricalFigure(String fateName, String fateBio, String fateImageURL, String realName, String realBio, String realImageURL, String realFlavorText) {
        this.fateName = fateName;
        this.fateBio = fateBio;
        this.fateImageURL = fateImageURL;
        this.realName = realName;
        this.realBio = realBio;
        this.realImageURL = realImageURL;
        this.realFlavorText = realFlavorText;
    }

    public HistoricalFigure(History historyGSON, Fate fateGSON, FateImages fateImagesGSON, String fateImageID) {


        this.realName = historyGSON.getDisplaytitle();
        this.realBio = historyGSON.getExtract();
        try {
            this.realImageURL = historyGSON.getOriginalimage().getSource();
        } catch (Exception e) {
           this.realImageURL = null;
        }

        this.realFlavorText = historyGSON.getDescription();

        this.fateName = fateGSON.getSections().get(0).getTitle();
        
        for (int i = 0; i < fateGSON.getSections().size(); i++) {
            String title = fateGSON.getSections().get(i).getTitle();
            if (Objects.equals(title, "Identity")) {
                this.fateBio = fateGSON.getSections().get(i).getContent().get(0).getText();
                break;
            }
        }
        
        for (int i = 0; i < fateImagesGSON.getQuery().getAllimages().size(); i++) {
            String name = fateImagesGSON.getQuery().getAllimages().get(i).getName();
            String imageURL = fateImagesGSON.getQuery().getAllimages().get(i).getUrl();
            if (name.contains(fateImageID)) {
                this.fateImageURL = imageURL;
                break;
            }
        }


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
