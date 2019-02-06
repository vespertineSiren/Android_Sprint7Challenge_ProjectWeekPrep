
package com.fatehistory.patrickjmartin.fatehistory.HistoryAPI.History;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Desktop {

    @SerializedName("page")
    @Expose
    private String page;
    @SerializedName("revisions")
    @Expose
    private String revisions;
    @SerializedName("edit")
    @Expose
    private String edit;
    @SerializedName("talk")
    @Expose
    private String talk;

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public Desktop withPage(String page) {
        this.page = page;
        return this;
    }

    public String getRevisions() {
        return revisions;
    }

    public void setRevisions(String revisions) {
        this.revisions = revisions;
    }

    public Desktop withRevisions(String revisions) {
        this.revisions = revisions;
        return this;
    }

    public String getEdit() {
        return edit;
    }

    public void setEdit(String edit) {
        this.edit = edit;
    }

    public Desktop withEdit(String edit) {
        this.edit = edit;
        return this;
    }

    public String getTalk() {
        return talk;
    }

    public void setTalk(String talk) {
        this.talk = talk;
    }

    public Desktop withTalk(String talk) {
        this.talk = talk;
        return this;
    }

}
