package com.javaex.oop.goods.v3;

public class GoodsApp {
	
	public static void main(String[] args) {
		
		Goods notebook = new Goods("LG Gram", 1500000);	//	사용자 정의 생성자 활용
		
		Goods smartphone = new Goods("iPhone SE", 650000);
		
		notebook.showInfo();
		smartphone.showInfo();
		
	}

}
