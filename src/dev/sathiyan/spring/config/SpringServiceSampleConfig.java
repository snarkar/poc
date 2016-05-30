package dev.sathiyan.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ImportResource("classpath:resources/spring-configuration.xml")
@EnableWebMvc
//@ComponentScan(basePackages = "dev.sathiyan.spring")
public class SpringServiceSampleConfig {
	

}