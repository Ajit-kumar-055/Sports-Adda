package com.pp.SportsAdda.Services;

import com.pp.SportsAdda.payloads.ExternalAPI.LiveSports;
import com.pp.SportsAdda.payloads.ExternalAPI.News.News;

public interface ExternalAPICallServ {
	
	News getSportsNews();
	LiveSports getLiveSports();
}
