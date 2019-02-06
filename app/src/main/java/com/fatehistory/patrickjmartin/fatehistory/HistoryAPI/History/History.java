
package com.fatehistory.patrickjmartin.fatehistory.HistoryAPI.History;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class History {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("displaytitle")
    @Expose
    private String displaytitle;
    @SerializedName("namespace")
    @Expose
    private Namespace namespace;
    @SerializedName("wikibase_item")
    @Expose
    private String wikibaseItem;
    @SerializedName("titles")
    @Expose
    private Titles titles;
    @SerializedName("pageid")
    @Expose
    private Integer pageid;
    @SerializedName("thumbnail")
    @Expose
    private Thumbnail thumbnail;
    @SerializedName("originalimage")
    @Expose
    private Originalimage originalimage;
    @SerializedName("lang")
    @Expose
    private String lang;
    @SerializedName("dir")
    @Expose
    private String dir;
    @SerializedName("revision")
    @Expose
    private String revision;
    @SerializedName("tid")
    @Expose
    private String tid;
    @SerializedName("timestamp")
    @Expose
    private String timestamp;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("content_urls")
    @Expose
    private ContentUrls contentUrls;
    @SerializedName("api_urls")
    @Expose
    private ApiUrls apiUrls;
    @SerializedName("extract")
    @Expose
    private String extract;
    @SerializedName("extract_html")
    @Expose
    private String extractHtml;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public History withType(String type) {
        this.type = type;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public History withTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDisplaytitle() {
        return displaytitle;
    }

    public void setDisplaytitle(String displaytitle) {
        this.displaytitle = displaytitle;
    }

    public History withDisplaytitle(String displaytitle) {
        this.displaytitle = displaytitle;
        return this;
    }

    public Namespace getNamespace() {
        return namespace;
    }

    public void setNamespace(Namespace namespace) {
        this.namespace = namespace;
    }

    public History withNamespace(Namespace namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getWikibaseItem() {
        return wikibaseItem;
    }

    public void setWikibaseItem(String wikibaseItem) {
        this.wikibaseItem = wikibaseItem;
    }

    public History withWikibaseItem(String wikibaseItem) {
        this.wikibaseItem = wikibaseItem;
        return this;
    }

    public Titles getTitles() {
        return titles;
    }

    public void setTitles(Titles titles) {
        this.titles = titles;
    }

    public History withTitles(Titles titles) {
        this.titles = titles;
        return this;
    }

    public Integer getPageid() {
        return pageid;
    }

    public void setPageid(Integer pageid) {
        this.pageid = pageid;
    }

    public History withPageid(Integer pageid) {
        this.pageid = pageid;
        return this;
    }

    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    public History withThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    public Originalimage getOriginalimage() {
        return originalimage;
    }

    public void setOriginalimage(Originalimage originalimage) {
        this.originalimage = originalimage;
    }

    public History withOriginalimage(Originalimage originalimage) {
        this.originalimage = originalimage;
        return this;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public History withLang(String lang) {
        this.lang = lang;
        return this;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public History withDir(String dir) {
        this.dir = dir;
        return this;
    }

    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }

    public History withRevision(String revision) {
        this.revision = revision;
        return this;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public History withTid(String tid) {
        this.tid = tid;
        return this;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public History withTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public History withDescription(String description) {
        this.description = description;
        return this;
    }

    public ContentUrls getContentUrls() {
        return contentUrls;
    }

    public void setContentUrls(ContentUrls contentUrls) {
        this.contentUrls = contentUrls;
    }

    public History withContentUrls(ContentUrls contentUrls) {
        this.contentUrls = contentUrls;
        return this;
    }

    public ApiUrls getApiUrls() {
        return apiUrls;
    }

    public void setApiUrls(ApiUrls apiUrls) {
        this.apiUrls = apiUrls;
    }

    public History withApiUrls(ApiUrls apiUrls) {
        this.apiUrls = apiUrls;
        return this;
    }

    public String getExtract() {
        return extract;
    }

    public void setExtract(String extract) {
        this.extract = extract;
    }

    public History withExtract(String extract) {
        this.extract = extract;
        return this;
    }

    public String getExtractHtml() {
        return extractHtml;
    }

    public void setExtractHtml(String extractHtml) {
        this.extractHtml = extractHtml;
    }

    public History withExtractHtml(String extractHtml) {
        this.extractHtml = extractHtml;
        return this;
    }

}
