package com.spring.prac.a;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class a {
	
	@GetMapping("/address")
	public String a_method() {
		return "aaa";
	}
}
