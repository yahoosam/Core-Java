package com.bridge.model;

public class Organizer extends BaseData {

	private String contactnumber;

	public Organizer(int id, String name, String contactnumber) {
		super(id, name);
		this.contactnumber = contactnumber;
	}

	public String getContactnumber() {
		return contactnumber;
	}

	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}

	@Override
	public String toString() {
		return "Organizer [contactnumber=" + contactnumber + ", id=" + id + ", name=" + name + "]";
	}

}
