package com.pp.SportsAdda.payloads.ExternalAPI;

import com.fasterxml.jackson.annotation.*;
import java.util.List;
import java.util.Map;

public class Event {
//    private String eid;
//    private Map<String, String> pids;
//    private Map<String, String> sids;
    private String tr1;
    private String tr2;
//    private String trh1;
//    private String trh2;
//    private String tr1OR;
//    private String tr2OR;
    private List<Team> t1;
    private List<Team> t2;
    private String eps;
//    private long esid;
//    private long epr;
//    private long ecov;
//    private long ern;
//    private String ernInf;
//    private long et;
    private long esd;
//    private Long luUT;
//    private long eds;
//    private long eact;
//    private long incsX;
//    private long comX;
//    private long luX;
//    private long statX;
//    private long subsX;
//    private long sdFowX;
//    private long sdInnX;
//    private long eo;
//    private long luC;
//    private long ehid;
//    private Stage stg;
//    private long pid;
//    private long spid;
//    private Long ewt;
//    private Long edf;

//    @JsonProperty("Eid")
//    public String getEid() { return eid; }
//    @JsonProperty("Eid")
//    public void setEid(String value) { this.eid = value; }
//
//    @JsonProperty("Pids")
//    public Map<String, String> getPids() { return pids; }
//    @JsonProperty("Pids")
//    public void setPids(Map<String, String> value) { this.pids = value; }
//
//    @JsonProperty("Sids")
//    public Map<String, String> getSids() { return sids; }
//    @JsonProperty("Sids")
//    public void setSids(Map<String, String> value) { this.sids = value; }
//
    @JsonProperty("teamOneScore")
    public String getTr1() { return tr1; }
    @JsonProperty("Tr1")
    public void setTr1(String value) { this.tr1 = value; }

    @JsonProperty("teamTwoScore")
    public String getTr2() { return tr2; }
    @JsonProperty("Tr2")
    public void setTr2(String value) { this.tr2 = value; }

//    @JsonProperty("Trh1")
//    public String getTrh1() { return trh1; }
//    @JsonProperty("Trh1")
//    public void setTrh1(String value) { this.trh1 = value; }
//
//    @JsonProperty("Trh2")
//    public String getTrh2() { return trh2; }
//    @JsonProperty("Trh2")
//    public void setTrh2(String value) { this.trh2 = value; }
//
//    @JsonProperty("Tr1OR")
//    public String getTr1OR() { return tr1OR; }
//    @JsonProperty("Tr1OR")
//    public void setTr1OR(String value) { this.tr1OR = value; }
//
//    @JsonProperty("Tr2OR")
//    public String getTr2OR() { return tr2OR; }
//    @JsonProperty("Tr2OR")
//    public void setTr2OR(String value) { this.tr2OR = value; }
//
    @JsonProperty("teamOne")
    public List<Team> getT1() { return t1; }
    @JsonProperty("T1")
    public void setT1(List<Team> value) { this.t1 = value; }

    @JsonProperty("teamTwo")
    public List<Team> getT2() { return t2; }
    @JsonProperty("T2")
    public void setT2(List<Team> value) { this.t2 = value; }

//  HT,FT,NS(not STarted), 15',87' etc
    @JsonProperty("matchTime")
    public String getEps() { return eps; }
    @JsonProperty("Eps")
    public void setEps(String value) { this.eps = value; }
//
//    @JsonProperty("Esid")
//    public long getEsid() { return esid; }
//    @JsonProperty("Esid")
//    public void setEsid(long value) { this.esid = value; }
//
//    @JsonProperty("Epr")
//    public long getEpr() { return epr; }
//    @JsonProperty("Epr")
//    public void setEpr(long value) { this.epr = value; }
//
//    @JsonProperty("Ecov")
//    public long getEcov() { return ecov; }
//    @JsonProperty("Ecov")
//    public void setEcov(long value) { this.ecov = value; }
//
//    @JsonProperty("Ern")
//    public long getErn() { return ern; }
//    @JsonProperty("Ern")
//    public void setErn(long value) { this.ern = value; }
//
//    @JsonProperty("ErnInf")
//    public String getErnInf() { return ernInf; }
//    @JsonProperty("ErnInf")
//    public void setErnInf(String value) { this.ernInf = value; }
//
//    @JsonProperty("Et")
//    public long getEt() { return et; }
//    @JsonProperty("Et")
//    public void setEt(long value) { this.et = value; }
//
    @JsonProperty("startDateTime")
    public long getESD() { return esd; }
    @JsonProperty("Esd")
    public void setESD(long value) { this.esd = value; }
//
//    @JsonProperty("LuUT")
//    public Long getLuUT() { return luUT; }
//    @JsonProperty("LuUT")
//    public void setLuUT(Long value) { this.luUT = value; }
//
//    @JsonProperty("Eds")
//    public long getEds() { return eds; }
//    @JsonProperty("Eds")
//    public void setEds(long value) { this.eds = value; }
//
//    @JsonProperty("Eact")
//    public long getEact() { return eact; }
//    @JsonProperty("Eact")
//    public void setEact(long value) { this.eact = value; }
//
//    @JsonProperty("IncsX")
//    public long getIncsX() { return incsX; }
//    @JsonProperty("IncsX")
//    public void setIncsX(long value) { this.incsX = value; }
//
//    @JsonProperty("ComX")
//    public long getCOMX() { return comX; }
//    @JsonProperty("ComX")
//    public void setCOMX(long value) { this.comX = value; }
//
//    @JsonProperty("LuX")
//    public long getLuX() { return luX; }
//    @JsonProperty("LuX")
//    public void setLuX(long value) { this.luX = value; }
//
//    @JsonProperty("StatX")
//    public long getStatX() { return statX; }
//    @JsonProperty("StatX")
//    public void setStatX(long value) { this.statX = value; }
//
//    @JsonProperty("SubsX")
//    public long getSubsX() { return subsX; }
//    @JsonProperty("SubsX")
//    public void setSubsX(long value) { this.subsX = value; }
//
//    @JsonProperty("SDFowX")
//    public long getSDFowX() { return sdFowX; }
//    @JsonProperty("SDFowX")
//    public void setSDFowX(long value) { this.sdFowX = value; }
//
//    @JsonProperty("SDInnX")
//    public long getSDInnX() { return sdInnX; }
//    @JsonProperty("SDInnX")
//    public void setSDInnX(long value) { this.sdInnX = value; }
//
//    @JsonProperty("EO")
//    public long getEo() { return eo; }
//    @JsonProperty("EO")
//    public void setEo(long value) { this.eo = value; }
//
//    @JsonProperty("LuC")
//    public long getLuC() { return luC; }
//    @JsonProperty("LuC")
//    public void setLuC(long value) { this.luC = value; }
//
//    @JsonProperty("Ehid")
//    public long getEhid() { return ehid; }
//    @JsonProperty("Ehid")
//    public void setEhid(long value) { this.ehid = value; }
//
//    @JsonProperty("Stg")
//    public Stage getStg() { return stg; }
//    @JsonProperty("Stg")
//    public void setStg(Stage value) { this.stg = value; }
//
//    @JsonProperty("Pid")
//    public long getPID() { return pid; }
//    @JsonProperty("Pid")
//    public void setPID(long value) { this.pid = value; }
//
//    @JsonProperty("Spid")
//    public long getSpid() { return spid; }
//    @JsonProperty("Spid")
//    public void setSpid(long value) { this.spid = value; }
//
//    @JsonProperty("Ewt")
//    public Long getEwt() { return ewt; }
//    @JsonProperty("Ewt")
//    public void setEwt(Long value) { this.ewt = value; }
//
//    @JsonProperty("Edf")
//    public Long getEdf() { return edf; }
//    @JsonProperty("Edf")
//    public void setEdf(Long value) { this.edf = value; }
}
