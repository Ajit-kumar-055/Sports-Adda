package com.pp.SportsAdda.payloads.ExternalAPI.News;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class Media {
	@lombok.Getter(onMethod_ = { @JsonProperty("resource_id") })
	@lombok.Setter(onMethod_ = { @JsonProperty("resource_id") })
	private String resourceID;
	@lombok.Getter(onMethod_ = { @JsonProperty("resource_type") })
	@lombok.Setter(onMethod_ = { @JsonProperty("resource_type") })
	private String resourceType;
	@lombok.Getter(onMethod_ = { @JsonProperty("resource_subtype") })
	@lombok.Setter(onMethod_ = { @JsonProperty("resource_subtype") })
	private String resourceSubtype;
	@lombok.Getter(onMethod_ = { @JsonProperty("provider") })
	@lombok.Setter(onMethod_ = { @JsonProperty("provider") })
	private String provider;
	@lombok.Getter(onMethod_ = { @JsonProperty("description") })
	@lombok.Setter(onMethod_ = { @JsonProperty("description") })
	private String description;
	@lombok.Getter(onMethod_ = { @JsonProperty("data") })
	@lombok.Setter(onMethod_ = { @JsonProperty("data") })
	private Object data;
}
