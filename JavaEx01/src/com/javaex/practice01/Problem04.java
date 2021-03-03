package com.javaex.practice01;

public class Problem04 {
	public static void main(String[] args) {
		
		for(int row = 1; row <= 10; row++) {
			int num = row;
			for(int col = 1; col <= 10; col++) {
				System.out.printf("%d\t", num);
				num++;
			}
			System.out.println();
		}
		
	}

}
