package com.lumen.threads;

class Child extends Thread {

	public Child(String name, int priority) {
		super(name);
		this.setPriority(priority);
		System.out.println(this);
		this.start();
	}

	@Override
	public void run() {
		String tname = Thread.currentThread().getName();
		for (int i = 0; i < 5; i++) {
			System.out.println(tname + "" + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

public class ExtendThread {
	public static void main(String[] args) {
		Child child1 = new Child( "Yash",Thread.MAX_PRIORITY);

		Child child2 = new Child( "Poppy",Thread.MIN_PRIORITY + 3);

		Child child3 = new Child( "Venky",Thread.NORM_PRIORITY + 2);

//		child1.start();
//		child2.start();
//		child3.start();

	}
}
