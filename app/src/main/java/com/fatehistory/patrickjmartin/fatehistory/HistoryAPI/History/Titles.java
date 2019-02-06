
package com.fatehistory.patrickjmartin.fatehistory.HistoryAPI.History;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Titles {

    @SerializedName("canonical")
    @Expose
    private String canonical;
    @SerializedName("normalized")
    @Expose
    private String normalized;
    @SerializedName("display")
    @Expose
    private String display;

    public String getCanonical() {
        return canonical;
    }

    public void setCanonical(String canonical) {
        this.canonical = canonical;
    }

    public Titles withCanonical(String canonical) {
        this.canonical = canonical;
        return this;
    }

    public String getNormalized() {
        return normalized;
    }

    public void setNormalized(String normalized) {
        this.normalized = normalized;
    }

    public Titles withNormalized(String normalized) {
        this.normalized = normalized;
        return this;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public Titles withDisplay(String display) {
        this.display = display;
        return this;
    }

}
