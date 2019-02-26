package com.HallBooking.utilizationService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.HallBooking.utilizationService.repository.UtilizationServiceUserRepository;

@SpringBootApplication
@EnableJpaAuditing
@ComponentScan(basePackages="com.HallBooking")
public class UtilizationServiceApplication {
 
	public static void main(String[] args) {
		SpringApplication.run(UtilizationServiceApplication.class, args);
	}

}
