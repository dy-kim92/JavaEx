package com.javaex;

//	���� ������ Ÿ��	
//	byte 1 , short 2 , int 4 , long 8
public class intLongEx {
	public static void main(String[] args) {
		
		int intVar = 2021;
		
		int intVar2;
//		intVar2 = 123549654321321321;
		
		long longVar = 2021;
		long longVar2;
		
		longVar2 = 65416871646161L;	//Long  ������ Ȯ���ϴ� L�� �������� �ۼ��� �־�� ��.
		
		//short type
		
		short s1 = 100;
		short s2 = 200;
		
//		short result = s1 + s2;		int�� ��ȯ�Ǿ� ���� = ��� int
		
		int result = s1 + s2;
		
//		System.out.println(s1 + "+" + s2 + "=" + result);
		
//		2���� 8���� 16����
		int bin, oct, hex;
		
		bin = 0b1100;	// 0b ���ξ� - 2����
		oct = 072;		// 0 ���ξ� - 8����
		hex = 0xFF;		// 0x ���ξ� - 16����
		
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
		
	}

}
