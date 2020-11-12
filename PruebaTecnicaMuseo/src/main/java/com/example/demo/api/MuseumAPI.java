package com.example.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

public interface MuseumAPI {
	
	@GetMapping(value = "/load", produces= {application/json})
	public responseEntity<ResponseWorkDTO> consultArtist(
			@RequestHeader (value="idMuseum",required=true) Integer idMuseum)
	
	

}
