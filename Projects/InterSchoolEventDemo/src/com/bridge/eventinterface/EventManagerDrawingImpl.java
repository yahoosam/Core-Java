package com.bridge.eventinterface;

import com.bridge.model.Event;

public class EventManagerDrawingImpl implements EventManger {

	@Override
	public Event create(int id) {
		return new Event(id, "Drawing Competition", "Daffodil - Beginers", "Grade1 to Grade3",
				"10/10/2021 09:15AM", "10/10/2021 11:30AM", false);
	}

}
