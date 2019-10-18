
package com.helb.noziv.weather48;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Metadata {

    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("transaction_id")
    @Expose
    private String transactionId;
    @SerializedName("version")
    @Expose
    private String version;
    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("longitude")
    @Expose
    private Double longitude;
    @SerializedName("units")
    @Expose
    private String units;
    @SerializedName("expire_time_gmt")
    @Expose
    private Integer expireTimeGmt;
    @SerializedName("status_code")
    @Expose
    private Integer statusCode;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public Integer getExpireTimeGmt() {
        return expireTimeGmt;
    }

    public void setExpireTimeGmt(Integer expireTimeGmt) {
        this.expireTimeGmt = expireTimeGmt;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

}
