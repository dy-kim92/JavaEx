package com.javaex.practice02;

import java.util.Scanner;

public class Problem04 {
	public static void main(String[] args) {
		
		int[] lotto = new int[6];
		int idx = 0;	// 인덱스 변수
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇조합 생성 ? ");
		int num = sc.nextInt();
		
		int[][] result = new int[num][6];
		
		for (int k = 0; k < num; k++) {
			while(idx < lotto.length) {
				//	난수발생
				int choice = (int)(Math.random() * 45) + 1;
				//	중복 데이터 체크
				boolean isDuplicated = false;
				
				if(idx != 0) {
					//	중복 체크
					for(int i = 0; i < idx; i++) {
						//	내부 값 체크
						if(lotto[i] == choice) {
							//	중복
							isDuplicated = true;
							break;
						}
					}
				}
				
				if(!isDuplicated) {
					//	중복되지 않을 때 코드 수행
					lotto[idx] = choice;
					idx++;
				}
			}
		}
		
		for (int i = 0; i < num; i++) {
			for(int j = 0; j < lotto.length; j++) {
				result[i][j] = lotto[j];
			}
		}
		
		for (int i = 0; i < num; i++) {
			for(int j = 0; j < lotto.length; j++) {
				System.out.print(lotto[j] + " ");
			}
			System.out.println();
		}
		
	}
	

}
