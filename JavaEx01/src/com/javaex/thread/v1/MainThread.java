package com.javaex.thread.v1;

public class MainThread {
	public static void main(String[] args) {
		//	main thread의 흐름과 다른 별도의 작업 흐름
		Thread thread = new DigitThread();
		thread.setName("DigitThread");
		//	쓰레드 시작
		thread.start();	//	start() 메소드 내에서 run 메소드를 대신 수행
		//	주의
//		thread.run();	//	일반 메소드로 run을 수행한 것
		
		//	main thread : A ~ Z 출력
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println("MainThread : " + ch);
			
			//	잠시 대기
			try {
				Thread.sleep(300);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
