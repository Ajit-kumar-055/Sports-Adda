package com.pp.SportsAdda.payloads.ExternalAPI.News;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Name {
	JIM_MUNRO, LIVESCORE_ADMIN, TOM_FAIRLESS;

	@JsonValue
	public String toValue() {
		switch (this) {
		case JIM_MUNRO:
			return "Jim Munro";
		case LIVESCORE_ADMIN:
			return "Livescore Admin";
		case TOM_FAIRLESS:
			return "Tom Fairless";
		}
		return null;
	}

	@JsonCreator
	public static Name forValue(String value) throws IOException {
		if (value.equals("Jim Munro"))
			return JIM_MUNRO;
		if (value.equals("Livescore Admin"))
			return LIVESCORE_ADMIN;
		if (value.equals("Tom Fairless"))
			return TOM_FAIRLESS;
		throw new IOException("Cannot deserialize Name");
	}
}
