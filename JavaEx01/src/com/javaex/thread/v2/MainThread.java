package com.javaex.thread.v2;

public class MainThread {
	public static void main(String[] args) {
		//	main thread의 흐름과 다른 별도의 작업 흐름
		Thread thread = new DigitThread();
		thread.setName("DigitThread");
		//	쓰레드 시작
		thread.start();	//	start() 메소드 내에서 run 메소드를 대신 수행
		//	주의
//		thread.run();	//	일반 메소드로 run을 수행한 것
		
		Thread thread2 = new Thread(new AlphabetRunnable());
		thread2.setName("AlphaberRunnable");
		//	생성자에 run 메소드가 구현된 Runnable 객체를 전달
		thread2.start();
		
		//	Working Thread 의 제어권을 유지하기 위해
		//	작업 흐름을 main 쓰레드에 합류
		try {
			thread.join();
			thread2.join();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main Thread 종료");
		
	}

}
