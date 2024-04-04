package com.demo.landing_pg;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RoughController {

	@GetMapping("/bca")
	public String rou() {
		return "sample";
	}
	
}
