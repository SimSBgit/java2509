package ch14.sec05.exam01;

import java.awt.Toolkit;

public class SleepExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 10; i++) {
			toolkit.beep();
			System.out.println("띵");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
