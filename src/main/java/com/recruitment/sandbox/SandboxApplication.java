package com.recruitment.sandbox;

import com.recruitment.sandbox.model.Customer;
import com.recruitment.sandbox.model.CustomerBuilder;
import com.recruitment.sandbox.model.Device;
import com.recruitment.sandbox.model.DeviceBuilder;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SandboxApplication {

	public static void main(String[] args) {
		SpringApplication.run(SandboxApplication.class, args);

		List<Customer> customers = new ArrayList<>();
		customers.addAll(createCustomers());

		//1. In the collection of customers find the first customer which has a fixed-line (device.mobile = false) and write down his name on the console

		//2. Write down into console collection of device names, which are unique (device.name i not same as other in the collection) and device price is less than 20000 crowns (device.price < 20000)

		//3. Collection from previous task 2. sort by device name and write down into the console

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
		devicesPavel.add(new DeviceBuilder()
				.id("device_1")
				.name("iPhone")
				.mobile(true)
				.price(new BigDecimal("29000"))
				.build()
		);

		devicesPavel.add(new DeviceBuilder()
				.id("device_2")
				.name("fixedLine")
				.mobile(false)
				.price(new BigDecimal("5000"))
				.build()
		);
		customers.add(
				new CustomerBuilder()
						.id("customer_1")
						.name("Pavel")
						.devices(devicesPavel)
						.build()
						);

		List<Device> devicesKarel = new ArrayList<>();
		devicesKarel.add(new DeviceBuilder()
				.id("device_3")
				.name("Alcatel")
				.mobile(true)
				.price(new BigDecimal("21000"))
				.build()
				);
		customers.add(
				new CustomerBuilder()
						.id("customer_2")
						.name("Karel")
						.devices(devicesKarel)
						.build()
						);

		List<Device> devicesPepa = new ArrayList<>();
		devicesPepa.add(new DeviceBuilder()
				.id("device_1")
				.name("iPhone")
				.mobile(true)
				.price(new BigDecimal("29000"))
				.build()
				);
		customers.add(
				new CustomerBuilder()
						.id("customer_3")
						.name("Pepa")
						.devices(devicesPepa)
						.build()
						);

		return customers;
	}
}