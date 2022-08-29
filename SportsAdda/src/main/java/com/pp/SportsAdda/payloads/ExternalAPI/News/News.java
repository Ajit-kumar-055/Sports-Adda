package com.pp.SportsAdda.payloads.ExternalAPI.News;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class News {
//	@lombok.Getter(onMethod_ = { @JsonProperty("segmentTracking") })
//	@lombok.Setter(onMethod_ = { @JsonProperty("segmentTracking") })
//	private SegmentTracking segmentTracking;
//	@lombok.Getter(onMethod_ = { @JsonProperty("adsTargeting") })
//	@lombok.Setter(onMethod_ = { @JsonProperty("adsTargeting") })
//	private AdsTargeting adsTargeting;
//	@lombok.Getter(onMethod_ = { @JsonProperty("layoutContext") })
//	@lombok.Setter(onMethod_ = { @JsonProperty("layoutContext") })
//	private LayoutContext layoutContext;
//	@lombok.Getter(onMethod_ = { @JsonProperty("topStories") })
//	@lombok.Setter(onMethod_ = { @JsonProperty("topStories") })
//	private List<FeaturedArticle> topStories;
//	@lombok.Getter(onMethod_ = { @JsonProperty("featuredArticles") })
//	@lombok.Setter(onMethod_ = { @JsonProperty("featuredArticles") })
//	private List<FeaturedArticle> featuredArticles;
//	@lombok.Getter(onMethod_ = { @JsonProperty("categories") })
//	@lombok.Setter(onMethod_ = { @JsonProperty("categories") })
//	private List<CategoryElement> categories;
	@lombok.Getter(onMethod_ = { @JsonProperty("homepageArticles") })
	@lombok.Setter(onMethod_ = { @JsonProperty("homepageArticles") })
	private List<HomepageArticle> homepageArticles;
	@lombok.Getter(onMethod_ = { @JsonProperty("isNetworkError") })
	@lombok.Setter(onMethod_ = { @JsonProperty("isNetworkError") })
	private boolean isNetworkError;
}
