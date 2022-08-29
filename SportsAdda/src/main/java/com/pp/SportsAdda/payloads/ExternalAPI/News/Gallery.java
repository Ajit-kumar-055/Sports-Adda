package com.pp.SportsAdda.payloads.ExternalAPI.News;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class Gallery {
	@lombok.Getter(onMethod_ = { @JsonProperty("url") })
	@lombok.Setter(onMethod_ = { @JsonProperty("url") })
	private String url;
	@lombok.Getter(onMethod_ = { @JsonProperty("alt") })
	@lombok.Setter(onMethod_ = { @JsonProperty("alt") })
	private String alt;
	@lombok.Getter(onMethod_ = { @JsonProperty("height") })
	@lombok.Setter(onMethod_ = { @JsonProperty("height") })
	private long height;
	@lombok.Getter(onMethod_ = { @JsonProperty("width") })
	@lombok.Setter(onMethod_ = { @JsonProperty("width") })
	private long width;
}
