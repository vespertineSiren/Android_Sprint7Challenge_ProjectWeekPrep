
package com.fatehistory.patrickjmartin.fatehistory.HistoryAPI.Fate;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Element {

    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("elements")
    @Expose
    private List<Object> elements = null;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Element withText(String text) {
        this.text = text;
        return this;
    }

    public List<Object> getElements() {
        return elements;
    }

    public void setElements(List<Object> elements) {
        this.elements = elements;
    }

    public Element withElements(List<Object> elements) {
        this.elements = elements;
        return this;
    }

}
