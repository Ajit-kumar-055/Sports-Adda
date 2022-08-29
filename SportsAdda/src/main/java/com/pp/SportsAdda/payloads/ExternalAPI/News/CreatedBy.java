package com.pp.SportsAdda.payloads.ExternalAPI.News;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class CreatedBy {
	@lombok.Getter(onMethod_ = { @JsonProperty("id") })
	@lombok.Setter(onMethod_ = { @JsonProperty("id") })
	private String id;
	@lombok.Getter(onMethod_ = { @JsonProperty("name") })
	@lombok.Setter(onMethod_ = { @JsonProperty("name") })
	private Name name;
}
