package com.example.ademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class CrudSimpleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSimpleApplication.class, args);
	}
	
	@Configuration
	public class WebMvcConfiguration implements WebMvcConfigurer {
	    public void addCorsMappings(CorsRegistry registry) {
	        
	        registry
	            .addMapping("/**")
	            .allowedOrigins("http://localhost:4200/")
	            // .allowedOriginPatterns("")
	            .allowCredentials(false)
	            .allowedHeaders("*")
	            .exposedHeaders("*")
	            .maxAge(-1)
	            .allowedMethods("*")
	            ;
	    }
	}


}
