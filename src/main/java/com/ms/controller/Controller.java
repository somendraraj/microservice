package com.ms.controller;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/add")
public class Controller {
	
	private static Random rand = new Random();
	
	@RequestMapping(value="/number",  method=RequestMethod.GET)
	public String getSum(HttpServletRequest request, HttpServletResponse response){
		int a = rand.nextInt(10);
		int b = rand.nextInt(10);
		int sum = a+b;
		return "a= "+a+", b= "+b+", a+b= "+sum;
	}

}
