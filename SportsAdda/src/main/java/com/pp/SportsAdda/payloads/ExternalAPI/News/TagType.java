package com.pp.SportsAdda.payloads.ExternalAPI.News;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum TagType {
	TEAM, TOURNAMENT;

	@JsonValue
	public String toValue() {
		switch (this) {
		case TEAM:
			return "team";
		case TOURNAMENT:
			return "tournament";
		}
		return null;
	}

	@JsonCreator
	public static TagType forValue(String value) throws IOException {
		if (value.equals("team"))
			return TEAM;
		if (value.equals("tournament"))
			return TOURNAMENT;
		throw new IOException("Cannot deserialize TagType");
	}
}
