
package com.fatehistory.patrickjmartin.fatehistory.HistoryAPI.FateImages;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class QueryContinue {

    @SerializedName("allimages")
    @Expose
    private Allimages allimages;

    public Allimages getAllimages() {
        return allimages;
    }

    public void setAllimages(Allimages allimages) {
        this.allimages = allimages;
    }

    public QueryContinue withAllimages(Allimages allimages) {
        this.allimages = allimages;
        return this;
    }

}
