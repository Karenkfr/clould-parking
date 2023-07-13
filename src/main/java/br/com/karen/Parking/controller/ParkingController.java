package br.com.karen.Parking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ParkingController {
	
	@GetMapping
	public String hello() {
		return "hello word!";
	}

}
