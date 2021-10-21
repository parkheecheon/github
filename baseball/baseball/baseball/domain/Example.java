package baseball.domain;

import java.util.Arrays;

public class Example {
	public static void main(String[] args) {
		int[][] arr1 = {{2},{4}};
		int[][] arr2 = {{6},{2}};
		System.out.println(arr1[0].length);
		int[][] answer = new int[arr1[0].length][arr1[0].length];
	    	for(int i=0;i<=arr1[0].length;i++){
	            for(int j=0;j<arr1[0].length;j++){
	                answer[i][j]=arr1[i][j]+arr2[i][j];
	                System.out.println(answer[i][j]);
		        }
	    	}
	}

}
