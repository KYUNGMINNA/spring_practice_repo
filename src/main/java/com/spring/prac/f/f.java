package com.spring.prac.f;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class f {
   
	@GetMapping("/address")
	   public String a_method() {
		return "fff";
	}
	
	
}
