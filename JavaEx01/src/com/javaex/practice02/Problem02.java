package com.javaex.practice02;

import java.util.Scanner;

public class Problem02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		int total = 0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("숫자를 입력하세요 >> ");
			arr[i] = sc.nextInt();
			total += arr[i];
		}
		
		double result = (double)total / arr.length;
		
		System.out.printf("합계는 %d, 평균은 %.1f입니다.\n", total, result);
		
		sc.close();
	}

}
