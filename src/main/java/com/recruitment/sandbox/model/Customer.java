package com.recruitment.sandbox.model;

import java.util.List;

/**
 * Created by David Tomcik on 28.07.2021.
 */
public class Customer {
	private String id;
	private String name;
	private List<Device> devices;

	public Customer(String id, String name, List<Device> devices) {
			this.id = id;
			this.name = name;
			this.devices = devices;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Device> getDevices() {
		return devices;
	}

	public void setDevices(List<Device> devices) {
		this.devices = devices;
	}
}
