package com.valdosm.enums;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.valdosm.enums.entities.Order;
import com.valdosm.enums.entities.OrderStatus;
import com.valdosm.enums.repository.OrderRepository;

@SpringBootApplication
public class EnumsApplication  implements CommandLineRunner{
	@Autowired
	private OrderRepository  repository;

	public static void main(String[] args) {
		SpringApplication.run(EnumsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order1 = new Order(null,Instant.parse("2021-12-20T21:04:00Z"),OrderStatus.CONTRATADO);
		Order order2 = new Order(null,Instant.now(),OrderStatus.DEMIRIDO);
		Order order3 = new Order(null,Instant.now(),OrderStatus.PROMOVIDO);

		repository.saveAll(Arrays.asList(order1, order2, order3));
		
	}

}
