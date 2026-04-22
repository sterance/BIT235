// Chris Smith - S1564427

// defines the package
package com.bit235.wiki;

// imports
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// marks this class as a springboot application
@SpringBootApplication
public class WikiApplication {

	// main method
	public static void main(String[] args) {
		// launches the application
		SpringApplication.run(WikiApplication.class, args);
	}

}