package com.bridge.model;

public class Event extends BaseData {

	private String desc;
	private String gradelimit;
	private String starttime;
	private String endtime;
	private boolean islive;

	public Event(int id, String name, String desc, String gradelimit, String starttime, String endtime,
			boolean islive) {
		super(id, name);
		this.desc = desc;
		this.gradelimit = gradelimit;
		this.starttime = starttime;
		this.endtime = endtime;
		this.islive = islive;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getGradelimit() {
		return gradelimit;
	}

	public void setGradelimit(String gradelimit) {
		this.gradelimit = gradelimit;
	}

	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public String getEndtime() {
		return endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	public boolean isIslive() {
		return islive;
	}

	public void setIslive(boolean islive) {
		this.islive = islive;
	}

	@Override
	public String toString() {
		return "Event [desc=" + desc + ", gradelimit=" + gradelimit + ", starttime=" + starttime + ", endtime="
				+ endtime + ", islive=" + islive + ", id=" + id + ", name=" + name + "]";
	}
}
