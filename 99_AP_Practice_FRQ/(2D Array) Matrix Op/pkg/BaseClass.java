package pkg;
import java.util.Scanner;
import java.util.Random;


class 2DArray {
	
	public static int diagonalOp(int[][] matA,int[][] matB){
		
		int sum = 0;
		
		for(int i = 0; i < matA.length; i++){
			sum = matA[i][i]*matB[i][i];
		}
		
		System.out.println(sum);
		return sum;
	}
}
