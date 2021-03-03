package com.javaex.practice02;

public class Problem04 {
	public static void main(String[] args) {
		
		int[] lotto = new int[6];
		int flag = 0;
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45 + 1);
			for(int k = 0; k <= i; k++) {
				if(i == k)	continue;
				else if(lotto[i] == lotto[k])	lotto[i] = (int)(Math.random()*45 + 1);
			}
		}
		
		for(int a = 0; a < lotto.length; a++) {
			System.out.print(lotto[a] + " ");
		}
		
	}
	

}
