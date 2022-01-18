package com.john.myproject;

public class TeoplitzTest {

	public static void main(String[] args) {
		int[][] matrix = {
				{1,  2, 3,4,5,6},
				{7,  1, 2,3,4,5},
				{8,  7, 1,2,3,4},
				{9,  8, 7,1,2,3},
				{10, 9, 8,7,1,2},
				{11,10, 9,8,7,1},
				{12,11,10,9,8,7}
		};
		System.out.println(check(matrix));

	}

	static boolean check(int[][] matrix) {
		for(int i=0; i<matrix.length-1; i++) {
			for (int j=0; j<matrix[0].length-1; j++) {
				if(matrix[i][j]!=matrix[i+1][j+1]) return false;
			}
		}
		return true;
	};
}

//selection sort
//insertion sort

