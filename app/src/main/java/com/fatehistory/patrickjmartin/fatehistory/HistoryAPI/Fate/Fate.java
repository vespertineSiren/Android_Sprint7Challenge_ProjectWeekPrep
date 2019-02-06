
package com.fatehistory.patrickjmartin.fatehistory.HistoryAPI.Fate;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Fate {

    @SerializedName("sections")
    @Expose
    private List<Section> sections = null;

    public List<Section> getSections() {
        return sections;
    }

    public void setSections(List<Section> sections) {
        this.sections = sections;
    }

    public Fate withSections(List<Section> sections) {
        this.sections = sections;
        return this;
    }

}
