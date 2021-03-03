package com.javaex;

//	정수 데이터 타입	
//	byte 1 , short 2 , int 4 , long 8
public class intLongEx {
	public static void main(String[] args) {
		
		int intVar = 2021;
		
		int intVar2;
//		intVar2 = 123549654321321321;
		
		long longVar = 2021;
		long longVar2;
		
		longVar2 = 65416871646161L;	//Long  형임을 확인하는 L을 마지막에 작성해 주어야 함.
		
		//short type
		
		short s1 = 100;
		short s2 = 200;
		
//		short result = s1 + s2;		int로 변환되어 연산 = 결과 int
		
		int result = s1 + s2;
		
//		System.out.println(s1 + "+" + s2 + "=" + result);
		
//		2진수 8진수 16진수
		int bin, oct, hex;
		
		bin = 0b1100;	// 0b 접두어 - 2진수
		oct = 072;		// 0 접두어 - 8진수
		hex = 0xFF;		// 0x 접두어 - 16진수
		
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
		
	}

}
