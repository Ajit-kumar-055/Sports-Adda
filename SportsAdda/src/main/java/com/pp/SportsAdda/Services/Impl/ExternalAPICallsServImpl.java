package com.pp.SportsAdda.Services.Impl;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.pp.SportsAdda.Services.ExternalAPICallServ;
import com.pp.SportsAdda.payloads.ExternalAPI.Stage;
import com.pp.SportsAdda.payloads.ExternalAPI.News.News;
import com.pp.SportsAdda.payloads.ExternalAPI.LiveSports;

@Service
public class ExternalAPICallsServImpl implements ExternalAPICallServ {
	@Override
	public News getSportsNews() {		
		RestTemplate restTemplate = new RestTemplate();
		String url = "https://livescore6.p.rapidapi.com/news/v2/list";
		HttpHeaders headers = new HttpHeaders();
		headers.set("X-RapidAPI-Key", "f75dffd11dmsh46f48d829d6569fp1e15a3jsn4a165ae9c6c3");
		HttpEntity request = new HttpEntity(headers);
		ResponseEntity<News> response = restTemplate.exchange(
				url,
				HttpMethod.GET,
				request,
				News.class
				);
		return response.getBody();
	}

	@Override
	public LiveSports getLiveSports() {
		RestTemplate restTemplate = new RestTemplate();
		String url = "https://livescore6.p.rapidapi.com/matches/v2/list-live?Category=soccer";
		HttpHeaders headers = new HttpHeaders();
		headers.set("X-RapidAPI-Key", "f75dffd11dmsh46f48d829d6569fp1e15a3jsn4a165ae9c6c3");
		HttpEntity request = new HttpEntity(headers);
		ResponseEntity<LiveSports> response = restTemplate.exchange(
				url,
				HttpMethod.GET,
				request,
				LiveSports.class
				);
		return response.getBody();
	}
}
