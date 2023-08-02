package com.lumen.threads;

public class ThreadSleep {

	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println(thread);

		for (int i = 1; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
