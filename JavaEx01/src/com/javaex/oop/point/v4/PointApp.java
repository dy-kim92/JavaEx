package com.javaex.oop.point.v4;

public class PointApp {
	public static void main(String[] args) {
		
		Point p1 = new Point();	//	기본 생성자 사용
		p1.setX(5);
		p1.setY(10);
		p1.draw();
		p1.draw(false);	//	오버로딩된 메소드를 호출
		
		//	초기화 진행 -> JVM Heap 메모리 지정
		Point p2 = new Point(15, 30);	// 사용자 정의 생성자 사용
		p2.draw();
		p2.draw(false);	//	오버로딩된 메소드를 호출
		
		ColorPoint cp = new ColorPoint(20, 40, "검정");
		cp.draw();
		cp.draw(false);
		
		System.out.println("===========");
		ColorPoint cp2 = new ColorPoint(30, 40, "빨강");
		cp.draw();
		
		//	부모 타입으로 자식을 참조할 수 있다
		Point cp3 = new ColorPoint(50, 100, "파랑");
		cp.draw();
		
	}

}
