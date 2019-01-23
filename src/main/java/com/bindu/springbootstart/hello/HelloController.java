package com.bindu.springbootstart.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	String sayHi() {
		return("Hi Bindu");
	}
}
