package com.javaex;

//	��� : ������ �ʴ� ��
//	����, �ʱ�ȭ, ��ȸ�� ����. ����Ұ�
public class ConstantEx {
	
	static final int SPEED_LIMIT = 120;	//���
	
	public static void main(String[] args) {
		// ��� ��� ����
		// �ڵ��� �������� ���δ�.
		// ���������� �����ϴ�.
		// ����Ұ� -> �ڵ��� ������ Ȯ��
		
//		final int SPEED_LIMIT = 130;	// final -> ����Ұ�
		
		int speed = 120;
		boolean b1 = speed > SPEED_LIMIT;
		
		System.out.println("���Ѽӵ��� �ʰ��ϼ̽��ϴ� ? " + b1);
		System.out.println("���Ѽӵ��� " + SPEED_LIMIT + "�Դϴ�.");


	}
}
