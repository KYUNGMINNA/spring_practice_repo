package com.spring.prac.e;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class e {
	
	@GetMapping("/address")
	public String e_method() {
		return "aaa";
	}
}
