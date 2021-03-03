package com.javaex.practice01;

import java.util.Scanner;

public class Problem07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=======================");
		System.out.println("  [ 숫자맞추기 게임 시작 ]  ");
		System.out.println("=======================");
		while(true) {
			int num = (int)(Math.random() * 100 + 1);
			System.out.println(num);
				while(true) {
					System.out.print(" >> ");
					int scan = sc.nextInt();
					
					if(scan < num) {
						System.out.println("더 높게");
					}else if(scan > num) {
						System.out.println("더 낮게");
					}else {
						System.out.println("맞았습니다.");
						break;
					}
				}
			
			System.out.println("게임을 종료하시겠습니까 ? ");
			char exit = sc.next().charAt(0);
			if(exit == 'y') {
				System.out.println("=======================");
				System.out.println("  [ 숫자맞추기 게임 종료 ]  ");
				System.out.println("=======================");
				break;
			}else if(exit == 'n') {
				continue;
			}else {
				System.out.println("잘못된 입력입니다.");
			}
			
		}
		sc.close();
		
		
	}

}
