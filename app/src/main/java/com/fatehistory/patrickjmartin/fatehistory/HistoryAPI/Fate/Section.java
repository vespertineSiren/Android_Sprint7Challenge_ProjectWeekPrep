
package com.fatehistory.patrickjmartin.fatehistory.HistoryAPI.Fate;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Section {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("level")
    @Expose
    private Integer level;
    @SerializedName("content")
    @Expose
    private List<Content> content = null;
    @SerializedName("images")
    @Expose
    private List<Image> images = null;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Section withTitle(String title) {
        this.title = title;
        return this;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Section withLevel(Integer level) {
        this.level = level;
        return this;
    }

    public List<Content> getContent() {
        return content;
    }

    public void setContent(List<Content> content) {
        this.content = content;
    }

    public Section withContent(List<Content> content) {
        this.content = content;
        return this;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public Section withImages(List<Image> images) {
        this.images = images;
        return this;
    }

}
