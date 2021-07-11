package com.demo.threading.synchronization;

public class DisplayMsgThread extends Thread {
	DisplayMessage dm;
	String msg;

	public DisplayMsgThread(DisplayMessage dm, String msg) {
		this.dm = dm;
		this.msg = msg;
	}

	@Override
	public void run() {
		dm.greetings(msg);
	}
}
