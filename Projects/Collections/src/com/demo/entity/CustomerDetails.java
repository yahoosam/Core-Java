package com.demo.entity;

public class CustomerDetails implements Comparable<CustomerDetails> {
	private int id;
	private String name;
	private String industry;

	public CustomerDetails(int id, String name, String industry) {
		super();
		this.id = id;
		this.name = name;
		this.industry = industry;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	@Override
	public String toString() {
		return "CustomerDetails [id=" + id + ", name=" + name + ", industry=" + industry + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((industry == null) ? 0 : industry.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerDetails other = (CustomerDetails) obj;
		if (id != other.id)
			return false;
		if (industry == null) {
			if (other.industry != null)
				return false;
		} else if (!industry.equals(other.industry))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(CustomerDetails o) {
		if (this.getId() < o.id) {
			return -1;
		} else if (this.getId() > o.id) {
			return 1;
		} else {
			return 0;
		}
		// return this.getIndustry().compareTo(o.getIndustry());
	}

}
