package com.javaex;

//	상수 : 변하지 않는 수
//	선언, 초기화, 조회는 가능. 변경불가
public class ConstantEx {
	
	static final int SPEED_LIMIT = 120;	//상수
	
	public static void main(String[] args) {
		// 상수 사용 이유
		// 코드의 가독성을 높인다.
		// 유지보수가 용이하다.
		// 변경불가 -> 코드의 안정성 확보
		
//		final int SPEED_LIMIT = 130;	// final -> 변경불가
		
		int speed = 120;
		boolean b1 = speed > SPEED_LIMIT;
		
		System.out.println("제한속도를 초과하셨습니다 ? " + b1);
		System.out.println("제한속도는 " + SPEED_LIMIT + "입니다.");


	}
}
