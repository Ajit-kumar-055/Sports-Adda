package com.pp.SportsAdda.payloads.ExternalAPI.News;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class HomepageArticle {
	@lombok.Getter(onMethod_ = { @JsonProperty("category") })
	@lombok.Setter(onMethod_ = { @JsonProperty("category") })
	private HomepageArticleCategory category;
	@lombok.Getter(onMethod_ = { @JsonProperty("articles") })
	@lombok.Setter(onMethod_ = { @JsonProperty("articles") })
	private List<FeaturedArticle> articles;
	@lombok.Getter(onMethod_ = { @JsonProperty("meta") })
	@lombok.Setter(onMethod_ = { @JsonProperty("meta") })
	private HomepageArticleMeta meta;
}
