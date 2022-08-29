package com.pp.SportsAdda.payloads.ExternalAPI.News;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class Links {
	@lombok.Getter(onMethod_ = { @JsonProperty("next") })
	@lombok.Setter(onMethod_ = { @JsonProperty("next") })
	private String next;
}
