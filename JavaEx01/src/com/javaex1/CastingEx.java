package com.javaex1;

// byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
public class CastingEx {
	public static void main(String[] args) {
		
//		implicitCastingEx();
		
		explicitCastingEx();
		
	}

	// 명시적 캐스팅
	// 표현 범위가 넓은 자료형 -> 좁은 자료형 : 데이터의 유실 가능성
	// 개발자가 명시적으로 타입 변환
	public static void explicitCastingEx() {
		
		double d = 1234.567;
		System.out.println(d);
		
		float f = (float)d;
		System.out.println(f);
		
		long l = (long)f;
		System.out.println(l);
		
		byte b = (byte)l;
		System.out.println(b);
		
	}
	
	//암묵적 캐스팅 (implicit casting: promption)
	// 표현 범위가 좁은 자료형 -> 넓은 자료형 (자바가 자동 변환)
	
	private static void implicitCastingEx() {
		byte b = 25;	// 1바이트 정수형
		System.out.println(b);
		
		short s = b;	// 2바이트 정수형
		System.out.println(s);
		
		int i = s;		// 4바이트 정수형
		System.out.println(i);
		
		long l = i;		// 8바이트 정수형
		System.out.println(l);
		
		float f = l;	// 4바이트 실수형 	long이 float 보다 바이트는 크지만 float가 표현범위가 넓음
		System.out.println(f);
		
		double d = f;	// 8바이트 실수형
		System.out.println(d);
		
		
	}
	
}
