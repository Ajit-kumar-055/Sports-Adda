package com.pp.SportsAdda.payloads.ExternalAPI.News;

import com.fasterxml.jackson.annotation.*;
import java.time.OffsetDateTime;
import java.util.List;

@lombok.Data
public class CategoryElement {
	@lombok.Getter(onMethod_ = { @JsonProperty("id") })
	@lombok.Setter(onMethod_ = { @JsonProperty("id") })
	private String id;
	@lombok.Getter(onMethod_ = { @JsonProperty("pathname") })
	@lombok.Setter(onMethod_ = { @JsonProperty("pathname") })
	private String pathname;
	@lombok.Getter(onMethod_ = { @JsonProperty("description") })
	@lombok.Setter(onMethod_ = { @JsonProperty("description") })
	private String description;
	@lombok.Getter(onMethod_ = { @JsonProperty("active") })
	@lombok.Setter(onMethod_ = { @JsonProperty("active") })
	private boolean active;
	@lombok.Getter(onMethod_ = { @JsonProperty("listPosition") })
	@lombok.Setter(onMethod_ = { @JsonProperty("listPosition") })
	private long listPosition;
	@lombok.Getter(onMethod_ = { @JsonProperty("title") })
	@lombok.Setter(onMethod_ = { @JsonProperty("title") })
	private String title;
	@lombok.Getter(onMethod_ = { @JsonProperty("initialTitle") })
	@lombok.Setter(onMethod_ = { @JsonProperty("initialTitle") })
	private String initialTitle;
	@lombok.Getter(onMethod_ = { @JsonProperty("subs") })
	@lombok.Setter(onMethod_ = { @JsonProperty("subs") })
	private List<Object> subs;
	@lombok.Getter(onMethod_ = { @JsonProperty("media") })
	@lombok.Setter(onMethod_ = { @JsonProperty("media") })
	private List<Media> media;
	@lombok.Getter(onMethod_ = { @JsonProperty("createdAt") })
	@lombok.Setter(onMethod_ = { @JsonProperty("createdAt") })
	private OffsetDateTime createdAt;
	@lombok.Getter(onMethod_ = { @JsonProperty("createdBy") })
	@lombok.Setter(onMethod_ = { @JsonProperty("createdBy") })
	private CreatedBy createdBy;
	@lombok.Getter(onMethod_ = { @JsonProperty("seo") })
	@lombok.Setter(onMethod_ = { @JsonProperty("seo") })
	private PurpleSEO seo;
	@lombok.Getter(onMethod_ = { @JsonProperty("updatedAt") })
	@lombok.Setter(onMethod_ = { @JsonProperty("updatedAt") })
	private OffsetDateTime updatedAt;
	@lombok.Getter(onMethod_ = { @JsonProperty("parentId") })
	@lombok.Setter(onMethod_ = { @JsonProperty("parentId") })
	private Object parentID;
}
