package com.javaex.practice01;

import java.util.Scanner;

public class Problem08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cash = 0;
		int scan = 0;
		int flag = 0;
		
		while(flag == 0) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택 > ");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.print("예금액 > ");
				scan = sc.nextInt();
				cash += scan;
				break;
			case 2:
				System.out.print("출금액 > ");
				scan = sc.nextInt();
				cash -= scan;
				break;
			case 3:
				System.out.println("잔고액 > " + cash);
				break;
			case 4:
				System.out.println("프로그램 종료");
				flag = 1;
				break;
			default:	
				System.out.println("다시 입력해주세요.");
				
				
			}
			
		}
		
	}

}
