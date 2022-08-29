package com.pp.SportsAdda.payloads.ExternalAPI.News;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class MainMedia {
//	@lombok.Getter(onMethod_ = { @JsonProperty("id") })
//	@lombok.Setter(onMethod_ = { @JsonProperty("id") })
//	private Object id;
//	@lombok.Getter(onMethod_ = { @JsonProperty("path") })
//	@lombok.Setter(onMethod_ = { @JsonProperty("path") })
//	private Object path;
	@lombok.Getter(onMethod_ = { @JsonProperty("gallery") })
	@lombok.Setter(onMethod_ = { @JsonProperty("gallery") })
	private Gallery gallery;
	@lombok.Getter(onMethod_ = { @JsonProperty("thumbnail") })
	@lombok.Setter(onMethod_ = { @JsonProperty("thumbnail") })
	private Gallery thumbnail;
}
