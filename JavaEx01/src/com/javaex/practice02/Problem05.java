package com.javaex.practice02;

public class Problem05 {
	public static void main(String[] args) {
		
		int scoreboard[][] = {
				{80, 75, 90, 95, 78},
				{92, 88, 89, 92, 70},
				{78, 80, 85, 86, 63},
				{83, 84, 89, 87, 75},
				{89, 83, 93, 94, 78}
		};
		
		int total = 0;
		int count = 0;
		
		//	행
		for(int row = 0; row < scoreboard.length; row++) {
			//	열
			for(int col = 0; col < scoreboard[row].length; col++) {
				if(scoreboard[row][col] >= 85) {
					total += scoreboard[row][col];
					count++;
				}
			}
		}
		
		System.out.println("총합 >> " + total);
//		System.out.println("평균값 >> " + (double)total / count);
		System.out.printf("평균값 >> %.2f\n", ((double)total / count));
		
	}

}
