package testLoop;

import java.util.Arrays;

public class arrayInLoop {
	public static void main(String[] args) {
		int[][] testArray = new int[5][] ;
		for(int i = 0; i<5; i++) {
			int j = i+1;
			testArray[i] = new int[6];
			for(int k=0; k<6; k++) {
				testArray[i][k] = j;
			}
		}
		System.out.println(Arrays.deepToString(testArray));
	}

}
