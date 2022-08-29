package com.pp.SportsAdda.payloads.ExternalAPI.News;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum FeaturedArticleType {
	EXCLUSIVE, NEWS;

	@JsonValue
	public String toValue() {
		switch (this) {
		case EXCLUSIVE:
			return "exclusive";
		case NEWS:
			return "news";
		}
		return null;
	}

	@JsonCreator
	public static FeaturedArticleType forValue(String value) throws IOException {
		if (value.equals("exclusive"))
			return EXCLUSIVE;
		if (value.equals("news"))
			return NEWS;
		throw new IOException("Cannot deserialize FeaturedArticleType");
	}
}
