package com.pp.SportsAdda.payloads.ExternalAPI.News;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class HomepageArticleMeta {
	@lombok.Getter(onMethod_ = { @JsonProperty("pagination") })
	@lombok.Setter(onMethod_ = { @JsonProperty("pagination") })
	private Pagination pagination;
}
