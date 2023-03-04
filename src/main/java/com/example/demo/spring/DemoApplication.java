package com.example.demo.spring;

import com.example.demo.spring.model.Person;
import com.example.demo.spring.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class DemoApplication {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(DemoApplication.class, args);

		var service = ctx.getBean(PersonService.class);
		log.info("{}",service.save(new Person("b", 2)));
		log.info("{}", service.getbyId(6));
	}

}
