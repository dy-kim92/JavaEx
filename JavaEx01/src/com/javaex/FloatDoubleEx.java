package com.javaex;

//	�Ǽ� float(4) double(8)
//	���е��� �����ϰ� ǥ�������� ���� �ڷ���
//	byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
public class FloatDoubleEx {
	public static void main(String[] args) {
		
		float floatVar = 3.14159F;	// F or f ����
		double doubleVar = 3.14159;	// �Ǽ��� �⺻�� double
		
		int intVar = 30000000;
		floatVar = 3E7f;		// 3 x 10-7��
		doubleVar = 314159E-5;	// 314159 x 10-5��
		
		System.out.println("int : " + intVar);
		System.out.println("float : " + floatVar);
		System.out.println("double : " + doubleVar);
		
//		 �ε��Ҽ��� ����� ������
//		 float, double �� ���е��� �����ϰ� ǥ�� ������ ���� �ڷ���
//		 ���а�꿡 Ȱ��ÿ��� ����
		
		
		
	}

}
