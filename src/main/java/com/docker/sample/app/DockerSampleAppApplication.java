package com.docker.sample.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScans({@ComponentScan("com.docker.sample.app.controller")})
public class DockerSampleAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerSampleAppApplication.class, args);
	}

}
