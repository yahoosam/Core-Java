package com.bridge.model;

public class Venue extends BaseData {

	private String desc;
	private String address;
	
	public Venue(int id, String name, String desc, String address) {
		super(id, name);
		this.desc = desc;
		this.address = address;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Venue [desc=" + desc + ", address=" + address + ", id=" + id + ", name=" + name + "]";
	}

}
