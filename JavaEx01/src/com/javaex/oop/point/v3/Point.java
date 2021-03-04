package com.javaex.oop.point.v3;

//	v3. 메소드 오버로딩
//		같은 이름을 가졌지만, 매개변수의 타입, 순서, 갯수만 다른 메소드
public class Point {
	//필드
	private int x;
	private int y;
	
	//	생성자가 하나도 없으면 컴파일러가 기본 생성자를 추가 -> 생성자가 없는것이 아니다.
	
	public Point() {
		//	기본생성자 -> 파라미터가 없음
		System.out.println("기본 생성자 호출");
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("사용자 정의 생성자 호출");
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	//	출력 메소드
	public void draw() {
		System.out.printf("점[x=%d, y=%d]을 그렸습니다.\n", x, y);
	}
	
	public void draw(boolean show) {
		String message = String.format("점[x=%d, y=%d]를 ", x,y);
		if(show) {	// true
			message += "그렸습니다.\n";
		}else {
			message += "지웠습니다.\n";
		}
		System.out.println(message);
	}

}
