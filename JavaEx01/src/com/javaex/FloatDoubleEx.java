package com.javaex;

//	실수 float(4) double(8)
//	정밀도를 포기하고 표현범위를 넓힌 자료형
//	byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
public class FloatDoubleEx {
	public static void main(String[] args) {
		
		float floatVar = 3.14159F;	// F or f 접미
		double doubleVar = 3.14159;	// 실수형 기본은 double
		
		int intVar = 30000000;
		floatVar = 3E7f;		// 3 x 10-7승
		doubleVar = 314159E-5;	// 314159 x 10-5승
		
		System.out.println("int : " + intVar);
		System.out.println("float : " + floatVar);
		System.out.println("double : " + doubleVar);
		
//		 부동소수점 계산의 유의점
//		 float, double 의 정밀도를 포기하고 표현 범위를 넓힌 자료형
//		 정밀계산에 활용시에는 유의
		
		
		
	}

}
