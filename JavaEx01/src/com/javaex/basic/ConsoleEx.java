package com.javaex.basic;

//	클래스 임포트
import java.util.Scanner;

public class ConsoleEx {
	public static void main(String[] args) {
		
//		consoleOutputEx();
		consoleInputEx();
		
	}
	
	// 콘솔 입력
	private static void consoleInputEx() {
//		이름과 나이를 입력받아 출력하는 프로그램을 작성하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("이름은? ");
		String name = sc.next();
		System.out.print("나이는? ");
		int age = sc.nextInt();
		
		System.out.println("당신의 이름은 " + name + "이고 나이는 " + age + "입니다.");
		// 자원을 사용한 이후에는 반드시 닫아주자.
		sc.close();
	}

	// 콘솔 출력
	private static void consoleOutputEx() {
		// 표준 출력 (stdout) System.out
		// 표준 에러 (stderr) System.err
		// 메소드 print -> 출력 후 개행하지 않음
		// 메소드 println -> 출력 후 개행
		// printf -> 포멧 출력 -> String 항목에서 정리
		
		System.out.print("Hello ");
		System.out.println("Java");
		System.out.println("New Line");
		
		// 이스케이프 문자
		// \n (개행) \t (탭) \" (따옴표) \\ (역슬래시)
		System.out.print("Hello Java\n");
		System.out.println("Hello \t\tJava");
		System.out.println("Hello \"Java\"");
		
		String filePath = "D:\\myfile\\mypath";
		System.out.println(filePath);
		
	}
	
}
