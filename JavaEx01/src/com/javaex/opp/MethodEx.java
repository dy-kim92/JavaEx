package com.javaex.opp;

public class MethodEx {

	public static void main(String[] args) {
		printDivide(5, 3);
		printDivide(5, 0);
		double result = getSum(4, 5);
		System.out.println("4 + 5 = " + result);
		
		System.out.println("getSum : " + getSum(new double[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 }));
		
		System.out.println("getSumMany : " + getSumMany(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		
	}
	
	//	가변인수 : ...
	private static double getSumMany(double ...values) {
		return getSum(values);
	}
	
	//	매개변수의 개수를 모를때 -> 배열 이용
	private static double getSum(double[] values) {
		double total = 0;
		for(double value: values) {
			total += value;
		}
		return total;
	}
	
	//	반환값을 받고자 한다면 리턴 타입 지정
	private static double getSum(double num1, double num2) {
		return	num1 + num2;	// 반드시 지정한 리턴 타입과 일치해야 함
	}
	
	// 반환값이 없을 경우 void 타입 지정
	private static void printDivide(int num1, int num2) {	// num1,2 -> 파라미터
		if(num2 == 0) {
			System.out.println("0으로는 나눌 수 없습니다.");
			return;	// return문을 만나면 남은 코드는 수행하지 않고 호출된 곳으로 되돌아간다. ( 아래의 / 코드 실행하지 않음 )
		}
		System.out.println(num1 / num2);
	}
	
}
