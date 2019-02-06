
package com.fatehistory.patrickjmartin.fatehistory.HistoryAPI.FateImages;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Query {

    @SerializedName("allimages")
    @Expose
    private List<Allimage> allimages = null;

    public List<Allimage> getAllimages() {
        return allimages;
    }

    public void setAllimages(List<Allimage> allimages) {
        this.allimages = allimages;
    }

    public Query withAllimages(List<Allimage> allimages) {
        this.allimages = allimages;
        return this;
    }

}
