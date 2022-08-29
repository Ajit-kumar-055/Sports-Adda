package com.pp.SportsAdda.payloads.ExternalAPI.News;
import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class LayoutContext {
	@lombok.Getter(onMethod_ = { @JsonProperty("meta") })
	@lombok.Setter(onMethod_ = { @JsonProperty("meta") })
	private LayoutContextMeta meta;
	@lombok.Getter(onMethod_ = { @JsonProperty("activeHeaderId") })
	@lombok.Setter(onMethod_ = { @JsonProperty("activeHeaderId") })
	private Object activeHeaderID;
}
