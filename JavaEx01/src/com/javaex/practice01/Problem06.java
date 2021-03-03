package com.javaex.practice01;

import java.util.Scanner;

public class Problem06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 >> ");
		int num = sc.nextInt();
		int total = 0;
		
		if(num%2 == 0) {
			for(int i = 2; i <= num; i += 2) {
				total += i;
			}
		}else {
			for(int j = 1; j <= num; j += 2) {
				total += j;
			}
		}
		
		System.out.println("결과값 : " + total);		
		sc.close();
	}

}
