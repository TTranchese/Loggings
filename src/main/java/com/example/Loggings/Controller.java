package com.example.Loggings;

import com.example.Loggings.services.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Autowired
	LogService logService;
	
	@GetMapping("/")
	public String welcome() {
		String message = "Welcome Message";
		logService.logger.info(message);
		return message;
	}
	
	@GetMapping("/exp")
	public String twoValues() {
		logService.logger.info("Starting");
		String str = "The power of "
				+ logService.n1 + " to "
				+ logService.n2 + " is "
				+ logService.powerExponent();
		logService.logger.info("Ending");
		return str;
	}
	
	@GetMapping("/get-errors")
	public void getErrors() {
		Error error = new Error("Throw error");
		logService.logger.error("Logging error", error);
	}
}
