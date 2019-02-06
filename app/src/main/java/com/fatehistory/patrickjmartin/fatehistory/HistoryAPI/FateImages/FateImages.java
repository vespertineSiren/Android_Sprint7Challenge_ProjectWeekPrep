
package com.fatehistory.patrickjmartin.fatehistory.HistoryAPI.FateImages;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FateImages {

    @SerializedName("query")
    @Expose
    private Query query;
    @SerializedName("query-continue")
    @Expose
    private QueryContinue queryContinue;

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }

    public FateImages withQuery(Query query) {
        this.query = query;
        return this;
    }

    public QueryContinue getQueryContinue() {
        return queryContinue;
    }

    public void setQueryContinue(QueryContinue queryContinue) {
        this.queryContinue = queryContinue;
    }

    public FateImages withQueryContinue(QueryContinue queryContinue) {
        this.queryContinue = queryContinue;
        return this;
    }

}
