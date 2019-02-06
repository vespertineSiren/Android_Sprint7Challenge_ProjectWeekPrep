
package com.fatehistory.patrickjmartin.fatehistory.HistoryAPI.Fate;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Content {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("elements")
    @Expose
    private List<Element> elements = null;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Content withType(String type) {
        this.type = type;
        return this;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Content withText(String text) {
        this.text = text;
        return this;
    }

    public List<Element> getElements() {
        return elements;
    }

    public void setElements(List<Element> elements) {
        this.elements = elements;
    }

    public Content withElements(List<Element> elements) {
        this.elements = elements;
        return this;
    }

}
