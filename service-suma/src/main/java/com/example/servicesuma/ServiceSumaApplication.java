package com.example.servicesuma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ServiceSumaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceSumaApplication.class, args);
	}
	@GetMapping ("/suma/{num1}/mas/{num2}")
	
			public String suma (@PathVariable String num1, @PathVariable String num2) 
			{
				Integer result = Integer.parseInt(num1) + Integer.parseInt(num2);
				FileRepository.salvar(Integer.toString(result), "result/suma.txt");
				return Integer.toString(result); 
			}

}
