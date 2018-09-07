package com.springs.victor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseHome {

	@RequestMapping("/")
	public String showHomePage() {
		return "index";
	}
	
	
}
