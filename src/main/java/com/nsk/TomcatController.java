package com.nsk;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class TomcatController {
 
	@GetMapping("/greet")
	public String greet() {
		String msg="Hello mr nsk";
		return msg;
	}
}
