package com.example.Loggings.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class LogService {
	@Value("${customVar.n1}")
	private int n1;
	@Value("${customVar.n2}")
	private int n2;
	
	public String powerExponent() {
		return "The power of 2 to 8 is " + (int) Math.pow(n1, n2) + "!";
	}
}
