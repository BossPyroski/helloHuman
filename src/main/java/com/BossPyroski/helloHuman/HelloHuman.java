package com.BossPyroski.helloHuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHuman {
	@RequestMapping("/")
	public String helloo(@RequestParam(value="name", required=false) String searchQuery) {
		if (searchQuery==null) {
			return "Hello Human! Welcome to spring boot!";
		}
		else {
			return "Hello "+ searchQuery;
		}
	}

}
