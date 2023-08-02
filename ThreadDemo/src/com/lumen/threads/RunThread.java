package com.lumen.threads;

class RunChild implements Runnable {

	Booking booking;
	int tickets;
	String counterName;

	public RunChild(String counterName, Booking booking, int tickets) {
		super();
		this.counterName = counterName;
		this.booking = booking;
		this.tickets = tickets;

		Thread thread = new Thread(this, counterName);
		thread.start();

	}

	@Override
	public void run() {
//		String tname = Thread.currentThread().getName();
//		Booking booking = new Booking();
		System.out.println(counterName);
		synchronized (booking) {
			double amount = booking.bookTickets(counterName, tickets);
			System.out.println(amount);
		}

//		for (int i = 0; i < 5; i++) {
//			System.out.println(tname + "" + i);
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
	}

}

public class RunThread {

	public static void main(String[] args) {
		Booking booking = new Booking();
		RunChild child1 = new RunChild("Counter-A", booking, 10);
		RunChild child2 = new RunChild("Counter-B", booking, 20);
		RunChild child3 = new RunChild("Counter-C", booking, 30);

//		Thread thread = new Thread(child, "A");
//		thread.start();
//
//		Thread thread2 = new Thread(child, "B");
//		thread2.start();

	}

}
