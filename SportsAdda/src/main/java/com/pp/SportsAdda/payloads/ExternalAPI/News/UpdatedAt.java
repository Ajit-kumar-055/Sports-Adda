package com.pp.SportsAdda.payloads.ExternalAPI.News;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class UpdatedAt {
	@lombok.Getter(onMethod_ = { @JsonProperty("time") })
	@lombok.Setter(onMethod_ = { @JsonProperty("time") })
	private String time;
	@lombok.Getter(onMethod_ = { @JsonProperty("unit") })
	@lombok.Setter(onMethod_ = { @JsonProperty("unit") })
	private Unit unit;
}
