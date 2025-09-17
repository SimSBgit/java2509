package ch14.sec07.exam03;

import ch14.sec07.exam02.PrintThread;

public class InterruptExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new PrintThread();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
		thread.interrupt();
	}

}
