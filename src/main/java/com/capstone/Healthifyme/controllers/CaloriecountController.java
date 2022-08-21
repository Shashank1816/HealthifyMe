package com.capstone.Healthifyme.controllers;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin(origins="http://localhost:4200")
public class CaloriecountController {
	
	
	@GetMapping(path = "/caloriecount")
	public String getCalorieCount(@RequestParam String food) throws IOException, InterruptedException {
		String api_id = "42c0cf1e";
		String api_key = "1854358d09753492a01854797a61183e";
		String urlString = "https://api.edamam.com/api/food-database/v2/parser?app_id="+api_id+"&app_key="+api_key+"&ingr="+food;
		
		var request = HttpRequest.newBuilder().GET().uri(URI.create(urlString)).build();
		var client = HttpClient.newBuilder().build();
		var response = client.send(request, HttpResponse.BodyHandlers.ofString());
		
		System.out.println("Response: "+ response.body());
		return response.body();
		
	}

}
