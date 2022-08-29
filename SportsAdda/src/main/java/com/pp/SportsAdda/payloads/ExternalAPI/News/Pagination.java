package com.pp.SportsAdda.payloads.ExternalAPI.News;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class Pagination {
	@lombok.Getter(onMethod_ = { @JsonProperty("total") })
	@lombok.Setter(onMethod_ = { @JsonProperty("total") })
	private long total;
	@lombok.Getter(onMethod_ = { @JsonProperty("count") })
	@lombok.Setter(onMethod_ = { @JsonProperty("count") })
	private long count;
	@lombok.Getter(onMethod_ = { @JsonProperty("per_page") })
	@lombok.Setter(onMethod_ = { @JsonProperty("per_page") })
	private long perPage;
	@lombok.Getter(onMethod_ = { @JsonProperty("current_page") })
	@lombok.Setter(onMethod_ = { @JsonProperty("current_page") })
	private long currentPage;
	@lombok.Getter(onMethod_ = { @JsonProperty("total_pages") })
	@lombok.Setter(onMethod_ = { @JsonProperty("total_pages") })
	private long totalPages;
	@lombok.Getter(onMethod_ = { @JsonProperty("links") })
	@lombok.Setter(onMethod_ = { @JsonProperty("links") })
	private Links links;
}
