package com.spring.prac.c;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class c {

	
	@GetMapping("caa")
	public String methodtest() {
		
		return "aaa";
	}
}
