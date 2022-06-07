import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	public static int diagonalOp(int[][] matA,int[][] matB){
		
		int sum = 0;
		
		for(int i = 0; i < 2; i++){
			sum = matA[i][i]*matB[i][i];
		}
		
		System.out.println(sum);
		return sum;
	}
	
	public static void main(String args[]) {
		
		int[][] arr1 = new int[3][3];
		int rows1 = arr1.length;
		int cols1 = arr1[0].length;
		for(int x1 = 0; x1 < rows1; x1++){
			for(int y1 = 0; y1 < cols1; y1++){
				arr1[x1][y1] = (int)(Math.random()*5);
			}
		}
		
		int[][] arr2 = new int[3][3];
		int rows2 = arr2.length;
		int cols2 = arr2[0].length;
		for(int x2 = 0; x2 < rows2; x2++){
			for(int y2 = 0; y2 < cols2; y2++){
				arr2[x2][y2] = (int)(Math.random()*5);
			}
		}
		
		diagonalOp(arr1,arr2);
		
		for(int i = 0; i < arr1.length;i++){
			for(int j = 0; j <arr1.length; j++){
				System.out.print(arr1[i][j] +" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		for(int i = 0; i < arr1.length;i++){
			for(int j = 0; j <arr1.length; j++){
				System.out.print(arr2[i][j] +" ");
			}
			System.out.println(" ");
		}
	}
	
	
}
