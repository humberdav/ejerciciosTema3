package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EjerciciosSumaApplication {
	int num1;
	int num2;
	int num3;
	public static void main(String[] args) {
		SpringApplication.run(EjerciciosSumaApplication.class, args);
		suma(10,20,30);
	}
	
	public static void suma(int num1,int num2,int num3) {
		System.out.println(num1 + num2 + num3); 
	}

}