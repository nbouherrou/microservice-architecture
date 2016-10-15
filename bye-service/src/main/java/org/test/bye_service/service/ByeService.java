package org.test.bye_service.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ByeService {
	
	@RequestMapping("/bye")
	public String sayBye(){
		return "Bye !";
	}

}
