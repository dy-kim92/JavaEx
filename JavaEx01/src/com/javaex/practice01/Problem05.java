package com.javaex.practice01;

import java.util.Scanner;

public class Problem05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int MAX = 0;
		
		System.out.println("정수를 입력해 주세요");
		
		for(int i = 1; i <= 5; i++) {
			System.out.print("숫자 : ");
			int num = sc.nextInt();
			if(num > MAX)	MAX = num;
		}
		
		System.out.println("최대값은 " + MAX + "입니다.");
		
	}

}
