package com.tracker.rest.controller;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tracker")
public class RestTrackerController {
	 @RequestMapping("/users")
	public Map<String, Object> getUser()
	{
		return Collections.singletonMap("prem", "Hello World");
	}

}
