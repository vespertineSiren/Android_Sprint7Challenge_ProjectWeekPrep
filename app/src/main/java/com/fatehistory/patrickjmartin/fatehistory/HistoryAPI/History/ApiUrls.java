
package com.fatehistory.patrickjmartin.fatehistory.HistoryAPI.History;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ApiUrls {

    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("metadata")
    @Expose
    private String metadata;
    @SerializedName("references")
    @Expose
    private String references;
    @SerializedName("media")
    @Expose
    private String media;
    @SerializedName("edit_html")
    @Expose
    private String editHtml;
    @SerializedName("talk_page_html")
    @Expose
    private String talkPageHtml;

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public ApiUrls withSummary(String summary) {
        this.summary = summary;
        return this;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public ApiUrls withMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    public String getReferences() {
        return references;
    }

    public void setReferences(String references) {
        this.references = references;
    }

    public ApiUrls withReferences(String references) {
        this.references = references;
        return this;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public ApiUrls withMedia(String media) {
        this.media = media;
        return this;
    }

    public String getEditHtml() {
        return editHtml;
    }

    public void setEditHtml(String editHtml) {
        this.editHtml = editHtml;
    }

    public ApiUrls withEditHtml(String editHtml) {
        this.editHtml = editHtml;
        return this;
    }

    public String getTalkPageHtml() {
        return talkPageHtml;
    }

    public void setTalkPageHtml(String talkPageHtml) {
        this.talkPageHtml = talkPageHtml;
    }

    public ApiUrls withTalkPageHtml(String talkPageHtml) {
        this.talkPageHtml = talkPageHtml;
        return this;
    }

}
