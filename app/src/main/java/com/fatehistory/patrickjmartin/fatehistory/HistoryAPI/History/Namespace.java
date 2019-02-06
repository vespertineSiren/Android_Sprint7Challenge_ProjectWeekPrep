
package com.fatehistory.patrickjmartin.fatehistory.HistoryAPI.History;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Namespace {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("text")
    @Expose
    private String text;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Namespace withId(Integer id) {
        this.id = id;
        return this;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Namespace withText(String text) {
        this.text = text;
        return this;
    }

}
