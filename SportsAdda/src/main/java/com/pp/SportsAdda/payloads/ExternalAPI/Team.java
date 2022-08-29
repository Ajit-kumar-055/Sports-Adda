package com.pp.SportsAdda.payloads.ExternalAPI;

import com.fasterxml.jackson.annotation.*;
import java.util.List;
import java.util.Map;

public class Team {
    private String nm;
//    private String id;
//    private long tbd;
    private String img;
//    private long gd;
//    private Map<String, List<String>> pids;
    private String coNm;
    private String coID;
//    private boolean hasVideo;

    @JsonProperty("teamName")
    public String getNm() { return nm; }
    @JsonProperty("Nm")
    public void setNm(String value) { this.nm = value; }

//    @JsonProperty("ID")
//    public String getID() { return id; }
//    @JsonProperty("ID")
//    public void setID(String value) { this.id = value; }
//
//    @JsonProperty("tbd")
//    public long getTbd() { return tbd; }
//    @JsonProperty("tbd")
//    public void setTbd(long value) { this.tbd = value; }

    @JsonProperty("teamLogo")
    public String getImg() { return img; }
    @JsonProperty("Img")
    public void setImg(String value) { this.img = value; }

//    @JsonProperty("Gd")
//    public long getGd() { return gd; }
//    @JsonProperty("Gd")
//    public void setGd(long value) { this.gd = value; }
//
//    @JsonProperty("Pids")
//    public Map<String, List<String>> getPids() { return pids; }
//    @JsonProperty("Pids")
//    public void setPids(Map<String, List<String>> value) { this.pids = value; }

    @JsonProperty("teamCountry")
    public String getCoNm() { return coNm; }
    @JsonProperty("CoNm")
    public void setCoNm(String value) { this.coNm = value; }

    @JsonProperty("teamCountryId")
    public String getCoID() { return coID; }
    @JsonProperty("CoId")
    public void setCoID(String value) { this.coID = value; }

//    @JsonProperty("HasVideo")
//    public boolean getHasVideo() { return hasVideo; }
//    @JsonProperty("HasVideo")
//    public void setHasVideo(boolean value) { this.hasVideo = value; }
}

