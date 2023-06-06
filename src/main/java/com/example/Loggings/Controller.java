package com.example.Loggings;

import com.example.Loggings.services.LogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	public Logger logger = LoggerFactory.getLogger(Controller.class);
	@Autowired
	private LogService logService;
	
	@GetMapping("/")
	public String welcome() {
		String message = "Welcome Message";
		logger.info(message);
		return message;
	}
	
	@GetMapping("/exp")
	public String twoValues() {
		logger.info("Starting");
		String str = "The power of "
				+ logService.n1 + " to "
				+ logService.n2 + " is "
				+ logService.powerExponent();
		logger.info("Ending");
		return str;
	}
	
	@GetMapping("/get-errors")
	public void getErrors() {
		Error error = new Error("Throw error");
		logger.error("Logging error", error);
	}
}
