package com.spring.prac.c;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class c {
	
	@GetMapping("/address")
	public String c_method()	{
		return "ccc";
	}
	

}
