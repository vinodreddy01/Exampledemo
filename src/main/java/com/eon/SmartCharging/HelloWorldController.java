package com.eon.SmartCharging;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/v")
	public String helloworld() {
	return "HelloWorld this is vinod ";
	}
	
	@GetMapping("/R")
	public String hi() {
		return "welcome";
	}	
@GetMapping("/Vin")
	public String hello() {
		return "Updated vinod reddy";
	}
	}

