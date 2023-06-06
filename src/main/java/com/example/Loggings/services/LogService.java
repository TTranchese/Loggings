package com.example.Loggings.services;

import com.example.Loggings.Controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class LogService {
	@Value("${customVar.n1}")
	public int n1;
	@Value("${customVar.n2}")
	public int n2;
	
	public int powerExponent() {
		return (int) Math.pow(n1, n2);
	}
}
