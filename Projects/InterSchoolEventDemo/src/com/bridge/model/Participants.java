package com.bridge.model;

public class Participants extends BaseData {

	private String email;

	public Participants(int id, String name, String email) {
		super(id, name);
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Participants [email=" + email + ", id=" + id + ", name=" + name + "]";
	}
}
