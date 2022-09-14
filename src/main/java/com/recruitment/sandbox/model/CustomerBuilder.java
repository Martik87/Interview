package com.recruitment.sandbox.model;

import java.util.Date;
import java.util.List;

public class CustomerBuilder {
	private String id;
	private String name;
	private List<Device> devices;


	public CustomerBuilder() {
	}

	public CustomerBuilder id(String id) {
		this.id = id;
		return this;
	}

	public CustomerBuilder name(String name) {
		this.name = name;
		return this;
	}

	public CustomerBuilder devices(List<Device> devices) {
		this.devices = devices;
		return this;
	}

	public Customer build() {
		return new Customer(id, name, devices);
	}
}
