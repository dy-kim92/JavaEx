package com.javaex.oop.shape.v2;

//	추상 클래스 :
//			객체화 될 수 없고,
//			자식클래스에게 필드와 메소드를 물려주는 역할
//			특정 기능의 구현을 강제(규약)하는 역할을 수행
public abstract class Shape {
	//	필드
	protected int x;
	protected int y;
	
	//	생성자
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//	추상 클래스는 1개 이상의 추상 메소드를 갖는다
//	public abstract void draw();		//	-> Drawable 인터페이스에 위임
	public abstract double area();

}
