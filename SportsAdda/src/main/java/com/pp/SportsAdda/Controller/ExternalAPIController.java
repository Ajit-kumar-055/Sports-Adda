package com.pp.SportsAdda.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pp.SportsAdda.Services.ExternalAPICallServ;
import com.pp.SportsAdda.payloads.ExternalAPI.LiveSports;
import com.pp.SportsAdda.payloads.ExternalAPI.News.News;
//Comment
@RestController
@RequestMapping("/sports")
public class ExternalAPIController {

	@Autowired
	private ExternalAPICallServ externalAPICallServ;
	
	@GetMapping("/news")
	public ResponseEntity<?> getUser(){
		News allNews = this.externalAPICallServ.getSportsNews();
		return new ResponseEntity<>(allNews, HttpStatus.OK);
	}
	
	@GetMapping("/liveSports")
	public ResponseEntity<?> getLiveSports(){
		LiveSports allLiveSports = this.externalAPICallServ.getLiveSports();
		return new ResponseEntity<>(allLiveSports, HttpStatus.OK);
	}
}
