package com.spring.prac.b;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class b {
	
	@GetMapping("/address")
	public String bt_method() {
		return "aaa";
	}
}