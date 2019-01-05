package com.development.development;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DevelopmentController {

	
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello World";
	}
}
