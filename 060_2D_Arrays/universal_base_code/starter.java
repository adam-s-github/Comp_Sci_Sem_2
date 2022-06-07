import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		int arr[][] = new int[4][4];
		
		Random rand = new Random();
		
		for(int i = 0; i<arr.length;i++){
			for(int j = 0; j<arr.length;j++){
				arr[i][j] = rand.nextInt(8)+1;
			}
		}
		
		for(int i = 0; i<arr.length;i++){
			System.out.println("");
			for(int j = 0; j<arr.length;j++){
				System.out.print(arr[i][j] +" ");
			}
		}
		
		int sum = 0;
		for(int i = 0; i<arr.length;i++){
			for(int j = 0;j<arr.length;j++){
				sum = sum + arr[i][j];
			}
		}
		System.out.println("");
		System.out.println("Average: " + sum/(arr.length*arr.length));
		
		int sum2 = 0;
		int randRow = rand.nextInt(4);
		
		for(int j = randRow;j<arr.length;j+=4){
			for(int i = 0; i<arr.length;i++){
				sum2 = sum2 + arr[j][i];
			}
		}
		System.out.println("Row: " + randRow+1);
		System.out.println("Average: " + sum2/(arr.length));
		
		
		
		
		
	}
}
