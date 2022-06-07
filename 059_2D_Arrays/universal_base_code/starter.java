import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		int arr[][] = new int[5][6];
		
		for(int i = 0;i<arr.length;i++){
			for(int j = 0; j<arr.length;j++){
				arr[i][j] = 2;
			}
		}
		
		int sum = 0;
		for(int i = 0;i<arr.length;i++){
			for(int j = 0; j<arr.length;j++){
				sum = sum + arr[i][j];
			}
		}
		int avg = sum/(arr.length*arr.length);
		System.out.println(avg);
	}
}
