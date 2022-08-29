package com.pp.SportsAdda.payloads.ExternalAPI.News;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class AdsTargeting {
    @lombok.Getter(onMethod_ = {@JsonProperty("category")})
    @lombok.Setter(onMethod_ = {@JsonProperty("category")})
    private String category;
    @lombok.Getter(onMethod_ = {@JsonProperty("adUnitPathName")})
    @lombok.Setter(onMethod_ = {@JsonProperty("adUnitPathName")})
    private String adUnitPathName;
    @lombok.Getter(onMethod_ = {@JsonProperty("environment")})
    @lombok.Setter(onMethod_ = {@JsonProperty("environment")})
    private String environment;
    @lombok.Getter(onMethod_ = {@JsonProperty("sport")})
    @lombok.Setter(onMethod_ = {@JsonProperty("sport")})
    private String sport;
}
