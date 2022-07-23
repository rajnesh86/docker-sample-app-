package com.docker.sample.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class DockerController {

	@GetMapping("docker-session")
	public String getPropertyDetails() {

		return "Welcome to Docker Session !!!";
	}
}
