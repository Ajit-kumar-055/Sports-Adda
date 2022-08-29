package com.pp.SportsAdda.payloads.ExternalAPI.News;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class Related {
//	@lombok.Getter(onMethod_ = { @JsonProperty("relatedArticles") })
//	@lombok.Setter(onMethod_ = { @JsonProperty("relatedArticles") })
//	private List<Object> relatedArticles;
	@lombok.Getter(onMethod_ = { @JsonProperty("tags") })
	@lombok.Setter(onMethod_ = { @JsonProperty("tags") })
	private List<Tag> tags;
}
