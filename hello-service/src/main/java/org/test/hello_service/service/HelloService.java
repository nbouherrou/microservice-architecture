package org.test.hello_service.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloService {
	
	@RequestMapping("/hello")
	public String sayHello(){
		return "Hello !";
	}

}
