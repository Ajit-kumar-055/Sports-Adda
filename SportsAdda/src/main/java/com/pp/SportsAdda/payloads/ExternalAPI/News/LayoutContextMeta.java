package com.pp.SportsAdda.payloads.ExternalAPI.News;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class LayoutContextMeta {
	@lombok.Getter(onMethod_ = { @JsonProperty("title") })
	@lombok.Setter(onMethod_ = { @JsonProperty("title") })
	private String title;
	@lombok.Getter(onMethod_ = { @JsonProperty("description") })
	@lombok.Setter(onMethod_ = { @JsonProperty("description") })
	private String description;
	@lombok.Getter(onMethod_ = { @JsonProperty("h1") })
	@lombok.Setter(onMethod_ = { @JsonProperty("h1") })
	private String h1;
	@lombok.Getter(onMethod_ = { @JsonProperty("h2") })
	@lombok.Setter(onMethod_ = { @JsonProperty("h2") })
	private String h2;
	@lombok.Getter(onMethod_ = { @JsonProperty("primary_note") })
	@lombok.Setter(onMethod_ = { @JsonProperty("primary_note") })
	private String primaryNote;
	@lombok.Getter(onMethod_ = { @JsonProperty("footer") })
	@lombok.Setter(onMethod_ = { @JsonProperty("footer") })
	private String footer;
	@lombok.Getter(onMethod_ = { @JsonProperty("articleSchema") })
	@lombok.Setter(onMethod_ = { @JsonProperty("articleSchema") })
	private boolean articleSchema;
	@lombok.Getter(onMethod_ = { @JsonProperty("canonical") })
	@lombok.Setter(onMethod_ = { @JsonProperty("canonical") })
	private String canonical;
}
