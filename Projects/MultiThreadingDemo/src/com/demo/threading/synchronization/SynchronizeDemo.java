package com.demo.threading.synchronization;

public class SynchronizeDemo {

	public static void main(String[] args) {
		DisplayMessage dm = new DisplayMessage();

		DisplayMsgThread dmt = new DisplayMsgThread(dm, "Elon Musk");
		DisplayMsgThread dmt2 = new DisplayMsgThread(dm, "Stephen Hawkin");

		dmt.start();
		dmt2.start();
	}

}
