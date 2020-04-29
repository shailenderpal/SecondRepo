package com.first.demo.FirstSpringProject.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {

	
	@Value("${coach.name}")
	String coachName;
	
	@Value("${team.name}")
	String teamName;
	
	@GetMapping("/teamInfo")
	public String getTeamInfo()
	{
		return "Coach Name :"+coachName + "Team Name :"+teamName;
	}
	@GetMapping("/")
	public String sayHello() {
		return "Hello world , be safe and local time is :: " + LocalDateTime.now();
	}
	
	@GetMapping("/fortunes")
	public String sayFortune() {
		return "Today is my lucky day..... ";
	}

}
