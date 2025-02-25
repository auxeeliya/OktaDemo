package com.interview.okta.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping ("/okta")
public class OktaDemoController {
	@GetMapping("/secured")
	public ResponseEntity<String> getStringByPassingToken(){
		return new ResponseEntity<String>("Congratulations!!", HttpStatus.OK);
	}
	
}
