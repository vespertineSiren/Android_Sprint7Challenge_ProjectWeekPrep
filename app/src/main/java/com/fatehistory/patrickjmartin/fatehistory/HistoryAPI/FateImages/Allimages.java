
package com.fatehistory.patrickjmartin.fatehistory.HistoryAPI.FateImages;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Allimages {

    @SerializedName("aifrom")
    @Expose
    private String aifrom;

    public String getAifrom() {
        return aifrom;
    }

    public void setAifrom(String aifrom) {
        this.aifrom = aifrom;
    }

    public Allimages withAifrom(String aifrom) {
        this.aifrom = aifrom;
        return this;
    }

}
