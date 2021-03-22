package com.javaex1;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0~99 사이의 정수를 입력하세요 >> ");
		int scan = sc.nextInt();
		int flag = 0;
		int num = scan;
		int result = scan;
		
		while(scan != result) {
			int aa = num / 10;
			int a = num % 10;
			
			result = (a * 10) + a + aa;
			num = result;
			flag++;
		}
		
		System.out.printf("결과 : %d, %d\n", result, flag);
		
	}

}
