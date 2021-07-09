package com.bridge.eventinterface;

import com.bridge.model.Event;

public class EventMangerEssayImpl implements EventManger {

	@Override
	public Event create(int id) {
		return new Event(id, "Essay Writing Competition", "Incredibles - Primary", "Grade4 to Grade5",
				"10/10/2021 09:00AM", "10/10/2021 10:30AM", false);
	}

}
