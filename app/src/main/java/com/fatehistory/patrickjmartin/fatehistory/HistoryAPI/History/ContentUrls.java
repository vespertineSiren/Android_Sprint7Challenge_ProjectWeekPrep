
package com.fatehistory.patrickjmartin.fatehistory.HistoryAPI.History;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ContentUrls {

    @SerializedName("desktop")
    @Expose
    private Desktop desktop;
    @SerializedName("mobile")
    @Expose
    private Mobile mobile;

    public Desktop getDesktop() {
        return desktop;
    }

    public void setDesktop(Desktop desktop) {
        this.desktop = desktop;
    }

    public ContentUrls withDesktop(Desktop desktop) {
        this.desktop = desktop;
        return this;
    }

    public Mobile getMobile() {
        return mobile;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    public ContentUrls withMobile(Mobile mobile) {
        this.mobile = mobile;
        return this;
    }

}
