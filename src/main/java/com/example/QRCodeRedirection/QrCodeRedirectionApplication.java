package com.example.QRCodeRedirection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class QrCodeRedirectionApplication extends SpringBootServletInitializer{
	public static void main(String[] args) {
		SpringApplication.run(QrCodeRedirectionApplication.class, args);
	}
}
