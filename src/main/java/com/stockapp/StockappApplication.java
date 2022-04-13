package com.stockapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class StockappApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(StockappApplication.class, args);
	}

}
