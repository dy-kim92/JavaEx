package com.javaex.oop.goods.v4;

// 	v4. this : 객체 자신을 의미
//		this() : 내부에 있는 다른 생성자를 호출
public class Goods {

	// 필드
	// public > protected > default > private
	
	private String name;
	private int price;
		
	//	코드 내 생성자가 하나도 없으면 컴파일러가 기본 생성자를 추가
	//	사용자 정의 생성자가 있으면 기본 생성자를 추가하지 않는다.
	
	//	생성자1
	public Goods(String name) {
		this.name = name;
	}
	
	//	모든 필드를 초기화하는 생성자 : 생성자2
	public Goods(String name, int price) {
//		this.name = name;
		//	내부에 있는 다른 생성자
		this(name);
		this.price = price;
	}
	
	
	// Getter / Setter
	public String getName() {
		return name;
	}
	
//	public void setName(String name) {
//		this.name = name;
//	}

	public int getPrice() {
		return price;
	}

//	public void setPrice(int price) {
//		this.price = price;
//	}
	
	//	출력용 메소드
	public void showInfo() {
		System.out.printf("상품이름 : %s\n가격 : %d원\n", name, price);
	}

}

// 리턴타잆이 없을 땐 void
// 리턴하지 않는다 -> return -> 호출 코드 다음으로 진행