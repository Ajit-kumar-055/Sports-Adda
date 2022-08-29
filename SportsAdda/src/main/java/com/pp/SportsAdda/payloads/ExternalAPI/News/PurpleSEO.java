package com.pp.SportsAdda.payloads.ExternalAPI.News;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class PurpleSEO {
	@lombok.Getter(onMethod_ = { @JsonProperty("slug") })
	@lombok.Setter(onMethod_ = { @JsonProperty("slug") })
	private String slug;
	@lombok.Getter(onMethod_ = { @JsonProperty("index") })
	@lombok.Setter(onMethod_ = { @JsonProperty("index") })
	private boolean index;
	@lombok.Getter(onMethod_ = { @JsonProperty("title") })
	@lombok.Setter(onMethod_ = { @JsonProperty("title") })
	private String title;
	@lombok.Getter(onMethod_ = { @JsonProperty("follow") })
	@lombok.Setter(onMethod_ = { @JsonProperty("follow") })
	private boolean follow;
	@lombok.Getter(onMethod_ = { @JsonProperty("keywords") })
	@lombok.Setter(onMethod_ = { @JsonProperty("keywords") })
	private List<Object> keywords;
	@lombok.Getter(onMethod_ = { @JsonProperty("description") })
	@lombok.Setter(onMethod_ = { @JsonProperty("description") })
	private String description;
	@lombok.Getter(onMethod_ = { @JsonProperty("redirect_type") })
	@lombok.Setter(onMethod_ = { @JsonProperty("redirect_type") })
	private Object redirectType;
	@lombok.Getter(onMethod_ = { @JsonProperty("jsonld") })
	@lombok.Setter(onMethod_ = { @JsonProperty("jsonld") })
	private Object jsonld;
}
