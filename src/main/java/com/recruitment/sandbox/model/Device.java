package com.recruitment.sandbox.model;

import java.math.BigDecimal;

/**
 * Created by David Tomcik on 28.07.2021.
 */
public class Device {

	private String id;
	private String name;
	private boolean mobile;
	private BigDecimal price;
	public Device(DeviceBuilder deviceBuilder) {

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

	public boolean isMobile() {
		return mobile;
	}

	public void setMobile(boolean mobile) {
		this.mobile = mobile;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
}