package com.pp.SportsAdda.payloads.ExternalAPI;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class Stage {
//    private String sid;
    private String snm;
//    private String sds;
//    private String scd;
//    private String cid;
    private String cnm;
//    private String csnm;
//    private String ccd;
    private String ccdiso;
//    private String compID;
//    private String compN;
//    private String compST;
//    private String compD;
//    private long scu;
//    private long chi;
//    private long shi;
//    private String sdn;
    private List<Event> events;

//    @JsonProperty("Sid")
//    public String getSid() { return sid; }
//    @JsonProperty("Sid")
//    public void setSid(String value) { this.sid = value; }
//
    @JsonProperty("eventName")
    public String getSnm() { return snm; }
    @JsonProperty("Snm")
    public void setSnm(String value) { this.snm = value; }
//
//    @JsonProperty("Sds")
//    public String getSds() { return sds; }
//    @JsonProperty("Sds")
//    public void setSds(String value) { this.sds = value; }
//
//    @JsonProperty("Scd")
//    public String getScd() { return scd; }
//    @JsonProperty("Scd")
//    public void setScd(String value) { this.scd = value; }
//
//    @JsonProperty("Cid")
//    public String getCid() { return cid; }
//    @JsonProperty("Cid")
//    public void setCid(String value) { this.cid = value; }
//
    @JsonProperty("eventCountry")
    public String getCnm() { return cnm; }
    @JsonProperty("Cnm")
    public void setCnm(String value) { this.cnm = value; }
//
//    @JsonProperty("Csnm")
//    public String getCsnm() { return csnm; }
//    @JsonProperty("Csnm")
//    public void setCsnm(String value) { this.csnm = value; }
//
//    @JsonProperty("Ccd")
//    public String getCcd() { return ccd; }
//    @JsonProperty("Ccd")
//    public void setCcd(String value) { this.ccd = value; }

    @JsonProperty("eventCountryId")
    public String getCcdiso() { return ccdiso; }
    @JsonProperty("Ccdiso")
    public void setCcdiso(String value) { this.ccdiso = value; }
//
//    @JsonProperty("CompId")
//    public String getCompID() { return compID; }
//    @JsonProperty("CompId")
//    public void setCompID(String value) { this.compID = value; }
//
//    @JsonProperty("CompN")
//    public String getCompN() { return compN; }
//    @JsonProperty("CompN")
//    public void setCompN(String value) { this.compN = value; }
//
//    @JsonProperty("CompST")
//    public String getCompST() { return compST; }
//    @JsonProperty("CompST")
//    public void setCompST(String value) { this.compST = value; }
//
//    @JsonProperty("CompD")
//    public String getCompD() { return compD; }
//    @JsonProperty("CompD")
//    public void setCompD(String value) { this.compD = value; }
//
//    @JsonProperty("Scu")
//    public long getScu() { return scu; }
//    @JsonProperty("Scu")
//    public void setScu(long value) { this.scu = value; }
//
//    @JsonProperty("Chi")
//    public long getChi() { return chi; }
//    @JsonProperty("Chi")
//    public void setChi(long value) { this.chi = value; }
//
//    @JsonProperty("Shi")
//    public long getShi() { return shi; }
//    @JsonProperty("Shi")
//    public void setShi(long value) { this.shi = value; }
//
//    @JsonProperty("Sdn")
//    public String getSDN() { return sdn; }
//    @JsonProperty("Sdn")
//    public void setSDN(String value) { this.sdn = value; }

    @JsonProperty("Events")
    public List<Event> getEvents() { return events; }
    @JsonProperty("Events")
    public void setEvents(List<Event> value) { this.events = value; }
    }