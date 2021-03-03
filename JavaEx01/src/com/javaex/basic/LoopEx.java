package com.javaex.basic;

import java.util.Scanner;

public class LoopEx {
	public static void main(String[] args) {
		
//		whileEx01();
//		whileGugu();
//		doWhileEx();
//		infLoop();
//		forGugu();
//		continueEx();
//		breakEx();
//		nestedFor();
//		nestedWhile();
//		nestedForStar();
		nestedWhileStar();
//		sixRandom();
		
	}
	
	private static void sixRandom() {
		for(int i = 1; i <= 6; i++) {
			int num = (int)(Math.random()*45) + 1;
			System.out.print(num + " ");
		}
	}
////////////////////////////////////////////////////////////////////////////////////////////
	private static void nestedForStar() {
		int rowCount = 10;	// 줄 갯수
		
		for(int row = 1; row <= rowCount; row++) {
			for(int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	private static void nestedWhileStar() {
		int rowCount = 5;		// 줄 갯수
		int row = 1, col = 1;	//가로세로 1 초기값
		
		while(row <= rowCount) {
			while(col <= row) {
				System.out.print("*");
				col++;		
			}
			System.out.println();
			row++;
			col = 1;
		}
	}
//////////////////////////////////////////////////////////////////////////////////////////
	private static void nestedFor() {
		for(int i = 2; i <= 9; i++) {
			System.out.println(i + "단");
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
			System.out.println();
		}
	}
	
	private static void nestedWhile() {
		int dan = 2;
		int num = 1;
		
		while(dan <= 9) {
			System.out.println(dan + "단");
			while(num <= 9) {
				System.out.println(dan + " * " + num + " = " + (dan * num));
				num++;
			}
			dan++;
			num = 1;
		}
	}
//////////////////////////////////////////////////////////////////////////////////////////	
	private static void breakEx() {
		// 6의 배수이자 14의 배수인 가장 적은 정수 찾기
		int num = 1;
		while(true) {
			if(num % 6 == 0 && num % 14 == 0)	break;
			num++;
		}
		System.out.println(num);
	}
	
	private static void continueEx() {
		// 1에서 20까지의 수에서 2의배수와 3의배수를 제외한 숫자를 출력하세요
		for (int i = 1; i <= 20; i++) {
			if(i % 2 == 0 || i % 3 == 0)	continue;
			System.out.println(i);
		}
	}
	
	private static void forGugu() {
		// 입력받은 단의 구구단 표 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("단을 입력하세요 >> ");
		int dan = sc.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
		sc.close();
	}
	
	// while
	private static void whileEx01() {
		// I like java0 ~ 5
		
		int i = 0;
		while(i <= 5) {	// 반복조건
			System.out.println("I like java" + i);
			i++;	// 종료될 수 있는 조건을 개발자가 직접 설정
		}
	}
	
	// while - 구구단
	private static void whileGugu() {
		Scanner sc = new Scanner(System.in);		// Ctrl + Shift + O -> import 호출
		System.out.print("단을 입력해주세요 >> ");
		int dan = sc.nextInt();
		int i = 1;
		
		while(i <= 9) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
			i++;
		}
		sc.close();
	}
	
	//do - while
	private static void doWhileEx() {
		// 최초 1회는 반드시 실행되어야 하는 반복문
		// 사용자의 숫자를 입력받아 더하는 프로그램을 작성하시오. (0이면 종료)
		int num = 0;
		int total = 0;
		Scanner sc = new Scanner(System.in);
		
		
		do {
			System.out.println("정수를 입력하세요 [0이면 종료] >> ");
			num = sc.nextInt();
			total += num;
		}while(num != 0);
		
		System.out.println("합계 >> " + total);
		sc.close();
	}
	
	private static void infLoop() {
		// while, do-while 의 경우, 반복 조건은 개발자가 책임
		// 반복 조건이 true일 경우 무한루프에 빠진다
		// 특별한 경우가 아니라면 무한루프는 피하도록 한다.
		
		while (true) {
			System.out.println("Press Terminate Button");
		}
		
	}

}
