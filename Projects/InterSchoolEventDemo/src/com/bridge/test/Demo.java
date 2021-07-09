package com.bridge.test;

import com.bridge.eventinterface.EventManagerDrawingImpl;
import com.bridge.eventinterface.EventManger;
import com.bridge.eventinterface.EventMangerEssayImpl;
import com.bridge.model.Event;
import com.bridge.model.Organizer;
import com.bridge.model.Participants;
import com.bridge.model.Venue;

public class Demo {

	public static void main(String[] args) {

		Organizer org = new Organizer(101, "Bridge International School", "704-678-9273");
		System.out.println(org.toString());

		Venue venue = new Venue(0, "Jenny's Club", "Hall 203", "1000 Waterfront Blvd, Texas");
		System.out.println(venue.toString());

		Participants par = new Participants(1, "John", "john.k143@test.com");
		System.out.println(par.toString());

		Event event = new Event(1, "Quiz Competition", "Lightning Rangers - Junior", "Grade4 to Grade6",
				"10/10/2021 10:00AM", "10/10/2021 11:30AM", false);
		System.out.println(event.toString());

		// initialize event through an interface
		// just pass the id to create an event`
		EventManger em = new EventMangerEssayImpl();
		Event event2 = em.create(2);
		event2.setIslive(true);
		System.out.println(event2.toString());

		//below is an perfect example of run time polymorphism
		EventManger em2 = new EventManagerDrawingImpl();
		Event event3 = em2.create(3);
		System.out.println(event3.toString());
	}

}
