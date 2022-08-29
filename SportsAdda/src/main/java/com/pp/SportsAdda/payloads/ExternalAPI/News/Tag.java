package com.pp.SportsAdda.payloads.ExternalAPI.News;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class Tag {
	@lombok.Getter(onMethod_ = { @JsonProperty("title") })
	@lombok.Setter(onMethod_ = { @JsonProperty("title") })
	private String title;
//	@lombok.Getter(onMethod_ = { @JsonProperty("type") })
//	@lombok.Setter(onMethod_ = { @JsonProperty("type") })
//	private TagType type;
	@lombok.Getter(onMethod_ = { @JsonProperty("href") })
	@lombok.Setter(onMethod_ = { @JsonProperty("href") })
	private String href;
	@lombok.Getter(onMethod_ = { @JsonProperty("provider") })
	@lombok.Setter(onMethod_ = { @JsonProperty("provider") })
	private Provider provider;
}
