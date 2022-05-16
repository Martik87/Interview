package com.recruitment.sandbox;

import com.recruitment.sandbox.model.Customer;
import com.recruitment.sandbox.model.Device;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SandboxApplication {

	public static void main(String[] args) {
		SpringApplication.run(SandboxApplication.class, args);

		List<Customer> customers = new ArrayList<>();
		customers.addAll(createCustomers());

		// V kolekci customers najděte libovolného prvního zákazníka, který vlastní fixní linku a vypíšte jeho jméno do konzole. (Customer.mobile = false)

		// Do konzole vypište seznam jmen zařízení, které jsou unikátní (žádné jméno se se nesmí opakovat) a zároveň dražší než 20000Kč. (Device.price > 20000)

		// Výsledný seznam nalezených jmen zařízení seřaďte podle abecedy a vypište do konzole

	}


	/**
	 * creates two instances of Customer:
	 * 1 - Pavel , has two devices (1. iPhone, 2. fixedLine)
	 * 2 - Karel, has one device (1. Alcatel)
	 * 3 - Pepa , has one device (1. iPhone)
	 *
	 * @return - collection of customers
	 */
	private static Collection<Customer> createCustomers() {
		List<Customer> customers = new ArrayList<>();
		List<Device> devicesPavel = new ArrayList<>();
		devicesPavel.add(Device.builder()
				.id("device_1")
				.name("iPhone")
				.mobile(true)
				.price(new BigDecimal("29000"))
				.build());
		devicesPavel.add(Device.builder()
				.id("device_2")
				.name("fixedLine")
				.mobile(false)
				.price(new BigDecimal("5000"))
				.build());
		customers.add(
				Customer.builder()
						.id("customer_1")
						.name("Pavel")
						.devices(devicesPavel)
						.build());

		List<Device> devicesKarel = new ArrayList<>();
		devicesKarel.add(Device.builder()
				.id("device_3")
				.name("Alcatel")
				.mobile(true)
				.price(new BigDecimal("21000"))
				.build());
		customers.add(
				Customer.builder()
						.id("customer_2")
						.name("Karel")
						.devices(devicesKarel)
						.build());

		List<Device> devicesPepa = new ArrayList<>();
		devicesPepa.add(Device.builder()
				.id("device_1")
				.name("iPhone")
				.mobile(true)
				.price(new BigDecimal("29000"))
				.build());
		customers.add(
				Customer.builder()
						.id("customer_3")
						.name("Pepa")
						.devices(devicesPepa)
						.build());

		return customers;
	}

}
