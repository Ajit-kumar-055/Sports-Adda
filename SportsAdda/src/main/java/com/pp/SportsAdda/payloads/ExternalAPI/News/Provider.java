package com.pp.SportsAdda.payloads.ExternalAPI.News;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Provider {
	FOOTBALL_API;

	@JsonValue
	public String toValue() {
		switch (this) {
		case FOOTBALL_API:
			return "football-api";
		}
		return null;
	}

	@JsonCreator
	public static Provider forValue(String value) throws IOException {
		if (value.equals("football-api"))
			return FOOTBALL_API;
		throw new IOException("Cannot deserialize Provider");
	}
}
