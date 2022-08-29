package com.pp.SportsAdda.payloads.ExternalAPI.News;

import com.fasterxml.jackson.annotation.*;
import java.time.OffsetDateTime;

@lombok.Data
public class FeaturedArticle {
	@lombok.Getter(onMethod_ = { @JsonProperty("title") })
	@lombok.Setter(onMethod_ = { @JsonProperty("title") })
	private String title;
	@lombok.Getter(onMethod_ = { @JsonProperty("url") })
	@lombok.Setter(onMethod_ = { @JsonProperty("url") })
	private String url;
	
//	@lombok.Getter(onMethod_ = { @JsonProperty("id") })
//	@lombok.Setter(onMethod_ = { @JsonProperty("id") })
//	private String id;
	@lombok.Getter(onMethod_ = { @JsonProperty("mainMedia") })
	@lombok.Setter(onMethod_ = { @JsonProperty("mainMedia") })
	private MainMedia mainMedia;
	@lombok.Getter(onMethod_ = { @JsonProperty("categoryLabel") })
	@lombok.Setter(onMethod_ = { @JsonProperty("categoryLabel") })
	private String categoryLabel;
//	@lombok.Getter(onMethod_ = { @JsonProperty("updatedAt") })
//	@lombok.Setter(onMethod_ = { @JsonProperty("updatedAt") })
//	private UpdatedAt updatedAt;
	@lombok.Getter(onMethod_ = { @JsonProperty("publishedAt") })
	@lombok.Setter(onMethod_ = { @JsonProperty("publishedAt") })
	private OffsetDateTime publishedAt;

//	@lombok.Getter(onMethod_ = { @JsonProperty("shortTitle") })
//	@lombok.Setter(onMethod_ = { @JsonProperty("shortTitle") })
//	private Object shortTitle;
//	@lombok.Getter(onMethod_ = { @JsonProperty("type") })
//	@lombok.Setter(onMethod_ = { @JsonProperty("type") })
//	private FeaturedArticleType type;
//
//	@lombok.Getter(onMethod_ = { @JsonProperty("related") })
//	@lombok.Setter(onMethod_ = { @JsonProperty("related") })
//	private Related related;
}
