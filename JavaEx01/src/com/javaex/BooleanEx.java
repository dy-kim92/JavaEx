package com.javaex;

//	불린형
//	참 거짓을 다루는 자료형
//	값에 따라서 조건문, 제어문을 이용하여 흐름 제어 -> 중요
public class BooleanEx {
	public static void main(String[] args) {
		
		boolean b1 = true;	//참
		boolean b2 = false;	//거짓
		
		System.out.println(b1);
		System.out.println(b2);
		// 비교, 논리연산의 결과로 추출
		
		int v1 = 3, v2 = 5;
		
		boolean result = v1 < v2;
		
		System.out.println(v1 + " < " + v2 + " : " + result);
		
	}

}
