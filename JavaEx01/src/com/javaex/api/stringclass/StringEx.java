package com.javaex.api.stringclass;

public class StringEx {
	public static void main(String[] args) {
		
//		stringBasic();
		usefulMethods();
		
	}
	
	private static void usefulMethods() {
		//	String 다양한 메소드들
		String source = "Java Programming, JavaScript Programming";
		System.out.println("원본 : " + source);
		
		//	인덱스 접근
		System.out.println("length : " + source.length());
		System.out.println("5번 인덱스의 글자 : " + source.charAt(5));
		
		//	변환 메소드
		System.out.println("모두 소문자 : " + source.toLowerCase());
		System.out.println("모두 대문자 : " + source.toUpperCase());
		
		//	검색 메소드 (중요)
		int index = 0;
		index = source.indexOf("Java");
		System.out.println("1st Search : " + index);
		
		index += "Java".length();	//	인덱스를 4글자 뒤로 이동
		index = source.indexOf("Java", index);	//	검색 시작 인덱스
		System.out.println("2nd Search : " + index);
		index = source.indexOf("Java", index + "Java".length());
		System.out.println("3rd Search : " + index);	//	검색할 내용이 없을 때 -> -1 반환
		
		index = source.lastIndexOf("Java");	//	뒤에서부터 검색
		System.out.println("역방향 검색 : " + index);
		
		//	추출
		System.out.println("18번 인덱스 ~: " + source.substring(18)); 	// 끝까지
		System.out.println("18 ~ 21 : " + source.substring(18, 22));	//	18 ~ (22 - 1)
		
		//	치환 메소드
		System.out.println("Replace : " + source.replace("Java", "Python"));
		
		//	변환, 치환, 추출 메소드를 수행해도 원본이 변경되는 것은 아니다
		System.out.println("원본 : " + source);	//	String은 불변 객체 (immutable)
		
		//	Whitespace 제거
		String str = "              Hello         ";
		System.out.println("trim : [" + str.trim() + "]");
		
		//	문자열 분절
		String words[] = source.split(" ");	//	공백을 기준으로 문자열 분리 -> 배열
		
		for(String data: words) {
			System.out.println("chunk : " + data);
		}
		
		//	문자열의 비교
		//	compareTo : 같으면 0, 앞이 작으면 -1, 크면 1
		System.out.println("ABC".compareTo("ABD"));
		System.out.println("ABC".compareTo("ABC"));
		
	}
	
	private static void stringBasic() {
		String s1 = "Java";				//	리터럴
		String s2 = new String("Java");	//	새로운 객체 (Heap)
		String s3 = "Java";
		
		System.out.println("s1, s2 같은 객체 ? " + (s1 == s2));
		System.out.println("s1, s3 같은 객체 ? " + (s1 == s3));
		
		//	String은 char의 집함
		char letters[] = {'J', 'a', 'v', 'a'};
		String s4 = new String(letters);
		System.out.println("s4 = " + s4);
		
		//	valueOf 메소드 -> 기본 타입을 문자열로 변환
		String s5 = String.valueOf(3.14159f);
		System.out.println("s5 = " + s5);
		
	}

}
