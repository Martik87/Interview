package com.recruitment.sandbox.model;

import java.math.BigDecimal;

public class DeviceBuilder {

	private String id;
	private String name;
	private boolean mobile;
	private BigDecimal price;

	public DeviceBuilder() {
	}

	public DeviceBuilder price(BigDecimal price) {
		this.price = price;
		return this;
	}

	public DeviceBuilder id(String id) {
		this.id = id;
		return this;
	}

	public DeviceBuilder name(String name) {
		this.name = name;
		return this;
	}

	public DeviceBuilder mobile(boolean mobile) {
		this.mobile = mobile;
		return this;
	}

	//Return the finally constructed User object
	public Device build() {
		return new Device(this);
	}

}
