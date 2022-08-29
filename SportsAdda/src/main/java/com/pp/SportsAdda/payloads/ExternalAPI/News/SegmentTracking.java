package com.pp.SportsAdda.payloads.ExternalAPI.News;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class SegmentTracking {
	@lombok.Getter(onMethod_ = { @JsonProperty("screenClass") })
	@lombok.Setter(onMethod_ = { @JsonProperty("screenClass") })
	private String screenClass;
	@lombok.Getter(onMethod_ = { @JsonProperty("screenName") })
	@lombok.Setter(onMethod_ = { @JsonProperty("screenName") })
	private String screenName;
}
