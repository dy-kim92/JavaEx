package com.javaex.thread.v3;

//	run 메소드만 구성, Thread의 생성자로 전달
public class AlphabetRunnable implements Runnable{
	
	@Override
	public void run() {
		
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			//	현재 Thread를 구현하려면
			System.out.println(Thread.currentThread().getName() + " : " + ch);
			
			//	잠시 대기
			try {
				Thread.sleep(300);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
