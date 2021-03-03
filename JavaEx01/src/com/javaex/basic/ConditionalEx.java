package com.javaex.basic;

import java.util.Scanner;
public class ConditionalEx {
	public static void main(String[] args) {
		
//		ifEx();
//		switchEx2();
		ifPractice();
		
	}

	//	if 분기문
	private static void ifEx() {
//		점수를 입력받아 점수가 60점 이상이면 합격입니다. 를 출력하세요
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		
		if(score >= 60) {
			System.out.println("합격입니다.");
		}else {
			// 거짓이다
			System.out.println("불합격입니다.");
		}
		
		sc.close();
		
	}
	
	private static void switchEx() {
//		월을 입력받아 해당월의 일수를 출력하는 프로그램을 작성하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력하세요 : ");
		
		int month = sc.nextInt();
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			//	month가 1 || 3 || 5 || 7 || 8 || 10 || 12 와 같은 의미
			System.out.println(month + "월은 31일입니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month + "월은 30일입니다.");
			break;
		case 2:
			System.out.println(month + "월은 28일입니다.");
			break;
			default:
				System.out.println("?");
		}
		sc.close();
		
	}
	
	// java의 case 문에는  char, String도 점검할 수 있다.
	private static void switchEx2() {
		String day = "WED";
		String message;
		// 요일 변수: 지정된 범위의 값만 들어와야 한다.
		// 문자열 사용을 자제하고 -> enum 데이터 타입으로 변경하는게 좋다.
		switch (day) {
		case "SUN":
			message = "일요일";
			break;
		case "MON":
		case "TUE":
		case "WED":
		case "THU":
			message = "열공";
			break;
		case "FRI":
			message = "불금";
			break;
		case "SAT":
			message = "주말";
			break;
			default:
				message = "?";
		}
		
		System.out.println("오늘은 " + message);
	}
	
	// 3의배수 판독기
	private static void ifPractice() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 >> ");
		int score = sc.nextInt();
		/*
		if(score%3 == 0) {
			System.out.println(score + "는 3의 배수입니다.");
		}else {
			System.out.println(score + "는 3의 배수가 아닙니다.");
		}*/
		
		// 3항연산자 이용
		System.out.println(score + "는 " + (score % 3 == 0 ? "3의 배수입니다.": "3의 배수가 아닙니다."));
		
		sc.close();
	}
	
	// 점수 입력받아 등급 표시
	private static void switchEx3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 >> ");
		int score = sc.nextInt();
		
	}
	
}
