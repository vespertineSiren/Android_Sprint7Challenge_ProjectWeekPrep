
package com.fatehistory.patrickjmartin.fatehistory.HistoryAPI.Fate;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Image {

    @SerializedName("src")
    @Expose
    private String src;
    @SerializedName("caption")
    @Expose
    private String caption;

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public Image withSrc(String src) {
        this.src = src;
        return this;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Image withCaption(String caption) {
        this.caption = caption;
        return this;
    }

}
