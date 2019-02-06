
package com.fatehistory.patrickjmartin.fatehistory.HistoryAPI.FateImages;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Allimage {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("timestamp")
    @Expose
    private String timestamp;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("descriptionurl")
    @Expose
    private String descriptionurl;
    @SerializedName("ns")
    @Expose
    private Integer ns;
    @SerializedName("title")
    @Expose
    private String title;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Allimage withName(String name) {
        this.name = name;
        return this;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Allimage withTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Allimage withUrl(String url) {
        this.url = url;
        return this;
    }

    public String getDescriptionurl() {
        return descriptionurl;
    }

    public void setDescriptionurl(String descriptionurl) {
        this.descriptionurl = descriptionurl;
    }

    public Allimage withDescriptionurl(String descriptionurl) {
        this.descriptionurl = descriptionurl;
        return this;
    }

    public Integer getNs() {
        return ns;
    }

    public void setNs(Integer ns) {
        this.ns = ns;
    }

    public Allimage withNs(Integer ns) {
        this.ns = ns;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Allimage withTitle(String title) {
        this.title = title;
        return this;
    }

}
