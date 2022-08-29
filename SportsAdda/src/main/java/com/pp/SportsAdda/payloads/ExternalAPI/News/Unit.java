package com.pp.SportsAdda.payloads.ExternalAPI.News;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Unit {
	NEWS_DAY, NEWS_DAYS, NEWS_HOUR, NEWS_HOURS, NEWS_MINUTES, NEWS_WEEK, NEWS_WEEKS;

	@JsonValue
	public String toValue() {
		switch (this) {
		case NEWS_DAY:
			return "news.day";
		case NEWS_DAYS:
			return "news.days";
		case NEWS_HOUR:
			return "news.hour";
		case NEWS_HOURS:
			return "news.hours";
		case NEWS_MINUTES:
			return "news.minutes";
		case NEWS_WEEK:
			return "news.week";
		case NEWS_WEEKS:
			return "news.weeks";
		}
		return null;
	}

	@JsonCreator
	public static Unit forValue(String value) throws IOException {
		if (value.equals("news.day"))
			return NEWS_DAY;
		if (value.equals("news.days"))
			return NEWS_DAYS;
		if (value.equals("news.hour"))
			return NEWS_HOUR;
		if (value.equals("news.hours"))
			return NEWS_HOURS;
		if (value.equals("news.minutes"))
			return NEWS_MINUTES;
		if (value.equals("news.week"))
			return NEWS_WEEK;
		if (value.equals("news.weeks"))
			return NEWS_WEEKS;
		throw new IOException("Cannot deserialize Unit");
	}
}
