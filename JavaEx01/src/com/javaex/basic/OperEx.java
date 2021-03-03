package com.javaex.basic;

public class OperEx {
	public static void main(String[] args) {
		
//		arithOperEx();
//		logicalOperEx();
//		bitOperEx();
//		bitShiftEx();
		conditionalOperEx();
		
	}
	
	// 3항연산자
	private static void conditionalOperEx() {
		
		int a = 10;
		
		// a가 짝수면 "짝수", 홀수면 "홀수"
		String result = a % 2 == 0 ? "짝수" : "홀수" ;
		System.out.println(a + "는 짝수인가 ? " + result);
		
		// score >= 80 -> Good
		// 80 > score > 50 -> Pass
		// 50 > score -> Fail
		int score = 45;
		
		String message = score >= 80 ? "Good" : score > 50 ? "Pass" : "Fail";
		System.out.println("Score : " + score + ", Result : " + message);
		
		
		
	}
	
	// 비트시프트 연산자
	private static void bitShiftEx() {
		
		int val = 1;
		
		//좌측 Shift
		System.out.println(val);
		System.out.println(Integer.toBinaryString(val << 1));	// 왼쪽으로 1비트 이동
		System.out.println(Integer.toBinaryString(val << 2));	// 왼쪽으로 2비트 이동
		
		val = 0b1000;
		System.out.println(Integer.toBinaryString(val));
		System.out.println(Integer.toBinaryString(val >> 1));	// 오른쪽으로 1비트 이동
		System.out.println(Integer.toBinaryString(val >> 2));	// 오른쪽으로 2비트 이동
		
		
	}
	
	//비트연산자 & | ~
	// int 에만 적용. 비트 단위의 미세한 조정에 사용
	private static void bitOperEx() {
		
		int b1 = 0b1101;
		int b2 = 0b0111;
		
		System.out.println(Integer.toBinaryString(b1));
		System.out.println(Integer.toBinaryString(b2));
		
		int result = b1 & b2;	// 비트 논리곱
		System.out.println(Integer.toBinaryString(result));
		
		result = b1 | b2;		// 비트 논리합
		System.out.println(Integer.toBinaryString(result));
		
		result = ~b1;
		System.out.println(Integer.toBinaryString(result));
		
	}
	
	//비교 논리연산자 -> 결과 Boolean
	private static void logicalOperEx() {
		// 비교연산자 : == != >= > <= <
		int a = 7;
		int b = 3;
		
		System.out.println("a > b ? " + (a > b));
		System.out.println("a equals b ? " + (a == b));
		System.out.println("a note equals b ? " + (a != b));
		
		// 논리연산자 && , || , !
		// 집합론
		int val = 5;
		
		// val 이 0 초과 10 미만의 값인가 ?
		// 조건 1 : val > 0
		// 조건 2 : val < 10
		// 조건1 && 조건2
		boolean r1 = val > 0;
		boolean r2 = 10 > val;
		boolean r1andr2 = r1 && r2;
		
		System.out.println("r1 && r2 = " + r1andr2);
		
		// val 이 10 이상 0 이하의 값인가 ?
		// 조건 1 : val <= 0
		// 조건 2 : 10 <= val
		// 조건1 || 조건2
		r1 = val <= 0;
		r2 = 10 <= val;
		boolean r1orr2 = r1 || r2;
		
		System.out.println("r1 || r2 = " + r1orr2);
		
		// val 이 10 이상 0 이하의 값인가 ? -> 논리값을 뒤집는다
		boolean rNot = !r1orr2;	// 논리부정 (반대값)
		System.out.println("r1orr2 논리의 부정 : " + rNot);
		
	}
	
	
	private static void arithOperEx() {
		int a = 7;
		int b = 3;
		
		// 부호연산자
		System.out.println(-a);
		System.out.println(-1 * a);
		
		// 산술연산자 + - * / %
		System.out.println(a / b);
		System.out.println(a % b);
		
		System.out.println((float)a / (float)b);
		System.out.println((float)a / b);
		
		int c = 10;
		System.out.println(c);
		System.out.println(c++);
		System.out.println(c);
		
		c = 10;
		System.out.println(c);
		System.out.println(++c);
		System.out.println(c);
		
		int d = 10;
		System.out.println((float)d / 0);
		
		// 연산결과가 유한수인지 확인
		System.out.println("10.0 / 0 은 유한수 ? " + Double.isFinite((float)d / 0));
		
		System.out.println(0.0 / 0.0);
		System.out.println("0.0 / 0.0 is Nan ? " + Double.isNaN(0.0 / 0.0));
		
		// Infinity가 포함된 산술 계산식
		System.out.println(10.0 / 0 + 10);
		// NaN 가 포함된 계산식 - 계싼안됨
		System.out.println(0.0 / 0.0 + 10);
		
		// 할당연산자
		a = a + b;
		a += b;
		
		
	}

}
