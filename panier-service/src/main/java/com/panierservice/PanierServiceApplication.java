package com.panierservice;

import com.panierservice.beans.Panier;
import com.panierservice.repository.PanierRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class PanierServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PanierServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(PanierRepository panierRepository) {

		return args -> {
			panierRepository.save(new Panier( "cmd-1", 20, 20));
			panierRepository.save(new Panier("cmd2", 80, 3));
			panierRepository.save(new Panier("cmd3",90, 44));

		};

	}
}
