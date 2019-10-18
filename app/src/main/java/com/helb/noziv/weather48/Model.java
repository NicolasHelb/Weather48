
package com.helb.noziv.weather48;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Model {

    @SerializedName("metadata")
    @Expose
    private Metadata metadata;
    @SerializedName("forecasts")
    @Expose
    private List<Forecast> forecasts = null;

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public List<Forecast> getForecasts() {
        return forecasts;
    }

    public void setForecasts(List<Forecast> forecasts) {
        this.forecasts = forecasts;
    }


}
