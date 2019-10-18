
package com.helb.noziv.weather48;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Forecast {

    @SerializedName("class")
    @Expose
    private String _class;
    @SerializedName("expire_time_gmt")
    @Expose
    private Integer expireTimeGmt;
    @SerializedName("fcst_valid")
    @Expose
    private Integer fcstValid;
    @SerializedName("fcst_valid_local")
    @Expose
    private String fcstValidLocal;
    @SerializedName("num")
    @Expose
    private Integer num;
    @SerializedName("day_ind")
    @Expose
    private String dayInd;
    @SerializedName("temp")
    @Expose
    private Integer temp;
    @SerializedName("dewpt")
    @Expose
    private Integer dewpt;
    @SerializedName("hi")
    @Expose
    private Integer hi;
    @SerializedName("wc")
    @Expose
    private Integer wc;
    @SerializedName("feels_like")
    @Expose
    private Integer feelsLike;
    @SerializedName("icon_extd")
    @Expose
    private Integer iconExtd;
    @SerializedName("wxman")
    @Expose
    private String wxman;
    @SerializedName("icon_code")
    @Expose
    private Integer iconCode;
    @SerializedName("dow")
    @Expose
    private String dow;
    @SerializedName("phrase_12char")
    @Expose
    private String phrase12char;
    @SerializedName("phrase_22char")
    @Expose
    private String phrase22char;
    @SerializedName("phrase_32char")
    @Expose
    private String phrase32char;
    @SerializedName("subphrase_pt1")
    @Expose
    private String subphrasePt1;
    @SerializedName("subphrase_pt2")
    @Expose
    private String subphrasePt2;
    @SerializedName("subphrase_pt3")
    @Expose
    private String subphrasePt3;
    @SerializedName("pop")
    @Expose
    private Integer pop;
    @SerializedName("precip_type")
    @Expose
    private String precipType;
    @SerializedName("qpf")
    @Expose
    private Double qpf;
    @SerializedName("snow_qpf")
    @Expose
    private Double snowQpf;
    @SerializedName("rh")
    @Expose
    private Integer rh;
    @SerializedName("wspd")
    @Expose
    private Integer wspd;
    @SerializedName("wdir")
    @Expose
    private Integer wdir;
    @SerializedName("wdir_cardinal")
    @Expose
    private String wdirCardinal;
    @SerializedName("gust")
    @Expose
    private Object gust;
    @SerializedName("clds")
    @Expose
    private Integer clds;
    @SerializedName("vis")
    @Expose
    private Double vis;
    @SerializedName("mslp")
    @Expose
    private Double mslp;
    @SerializedName("uv_index_raw")
    @Expose
    private Double uvIndexRaw;
    @SerializedName("uv_index")
    @Expose
    private Integer uvIndex;
    @SerializedName("uv_warning")
    @Expose
    private Integer uvWarning;
    @SerializedName("uv_desc")
    @Expose
    private String uvDesc;
    @SerializedName("golf_index")
    @Expose
    private Integer golfIndex;
    @SerializedName("golf_category")
    @Expose
    private String golfCategory;
    @SerializedName("severity")
    @Expose
    private Integer severity;

    public String getClass_() {
        return _class;
    }

    public void setClass_(String _class) {
        this._class = _class;
    }

    public Integer getExpireTimeGmt() {
        return expireTimeGmt;
    }

    public void setExpireTimeGmt(Integer expireTimeGmt) {
        this.expireTimeGmt = expireTimeGmt;
    }

    public Integer getFcstValid() {
        return fcstValid;
    }

    public void setFcstValid(Integer fcstValid) {
        this.fcstValid = fcstValid;
    }

    public String getFcstValidLocal() {
        return fcstValidLocal;
    }

    public void setFcstValidLocal(String fcstValidLocal) {
        this.fcstValidLocal = fcstValidLocal;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getDayInd() {
        return dayInd;
    }

    public void setDayInd(String dayInd) {
        this.dayInd = dayInd;
    }

    public Integer getTemp() {
        return temp;
    }

    public void setTemp(Integer temp) {
        this.temp = temp;
    }

    public Integer getDewpt() {
        return dewpt;
    }

    public void setDewpt(Integer dewpt) {
        this.dewpt = dewpt;
    }

    public Integer getHi() {
        return hi;
    }

    public void setHi(Integer hi) {
        this.hi = hi;
    }

    public Integer getWc() {
        return wc;
    }

    public void setWc(Integer wc) {
        this.wc = wc;
    }

    public Integer getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(Integer feelsLike) {
        this.feelsLike = feelsLike;
    }

    public Integer getIconExtd() {
        return iconExtd;
    }

    public void setIconExtd(Integer iconExtd) {
        this.iconExtd = iconExtd;
    }

    public String getWxman() {
        return wxman;
    }

    public void setWxman(String wxman) {
        this.wxman = wxman;
    }

    public Integer getIconCode() {
        return iconCode;
    }

    public void setIconCode(Integer iconCode) {
        this.iconCode = iconCode;
    }

    public String getDow() {
        return dow;
    }

    public void setDow(String dow) {
        this.dow = dow;
    }

    public String getPhrase12char() {
        return phrase12char;
    }

    public void setPhrase12char(String phrase12char) {
        this.phrase12char = phrase12char;
    }

    public String getPhrase22char() {
        return phrase22char;
    }

    public void setPhrase22char(String phrase22char) {
        this.phrase22char = phrase22char;
    }

    public String getPhrase32char() {
        return phrase32char;
    }

    public void setPhrase32char(String phrase32char) {
        this.phrase32char = phrase32char;
    }

    public String getSubphrasePt1() {
        return subphrasePt1;
    }

    public void setSubphrasePt1(String subphrasePt1) {
        this.subphrasePt1 = subphrasePt1;
    }

    public String getSubphrasePt2() {
        return subphrasePt2;
    }

    public void setSubphrasePt2(String subphrasePt2) {
        this.subphrasePt2 = subphrasePt2;
    }

    public String getSubphrasePt3() {
        return subphrasePt3;
    }

    public void setSubphrasePt3(String subphrasePt3) {
        this.subphrasePt3 = subphrasePt3;
    }

    public Integer getPop() {
        return pop;
    }

    public void setPop(Integer pop) {
        this.pop = pop;
    }

    public String getPrecipType() {
        return precipType;
    }

    public void setPrecipType(String precipType) {
        this.precipType = precipType;
    }

    public Double getQpf() {
        return qpf;
    }

    public void setQpf(Double qpf) {
        this.qpf = qpf;
    }

    public Double getSnowQpf() {
        return snowQpf;
    }

    public void setSnowQpf(Double snowQpf) {
        this.snowQpf = snowQpf;
    }

    public Integer getRh() {
        return rh;
    }

    public void setRh(Integer rh) {
        this.rh = rh;
    }

    public Integer getWspd() {
        return wspd;
    }

    public void setWspd(Integer wspd) {
        this.wspd = wspd;
    }

    public Integer getWdir() {
        return wdir;
    }

    public void setWdir(Integer wdir) {
        this.wdir = wdir;
    }

    public String getWdirCardinal() {
        return wdirCardinal;
    }

    public void setWdirCardinal(String wdirCardinal) {
        this.wdirCardinal = wdirCardinal;
    }

    public Object getGust() {
        return gust;
    }

    public void setGust(Object gust) {
        this.gust = gust;
    }

    public Integer getClds() {
        return clds;
    }

    public void setClds(Integer clds) {
        this.clds = clds;
    }

    public Double getVis() {
        return vis;
    }

    public void setVis(Double vis) {
        this.vis = vis;
    }

    public Double getMslp() {
        return mslp;
    }

    public void setMslp(Double mslp) {
        this.mslp = mslp;
    }

    public Double getUvIndexRaw() {
        return uvIndexRaw;
    }

    public void setUvIndexRaw(Double uvIndexRaw) {
        this.uvIndexRaw = uvIndexRaw;
    }

    public Integer getUvIndex() {
        return uvIndex;
    }

    public void setUvIndex(Integer uvIndex) {
        this.uvIndex = uvIndex;
    }

    public Integer getUvWarning() {
        return uvWarning;
    }

    public void setUvWarning(Integer uvWarning) {
        this.uvWarning = uvWarning;
    }

    public String getUvDesc() {
        return uvDesc;
    }

    public void setUvDesc(String uvDesc) {
        this.uvDesc = uvDesc;
    }

    public Integer getGolfIndex() {
        return golfIndex;
    }

    public void setGolfIndex(Integer golfIndex) {
        this.golfIndex = golfIndex;
    }

    public String getGolfCategory() {
        return golfCategory;
    }

    public void setGolfCategory(String golfCategory) {
        this.golfCategory = golfCategory;
    }

    public Integer getSeverity() {
        return severity;
    }

    public void setSeverity(Integer severity) {
        this.severity = severity;
    }

}
