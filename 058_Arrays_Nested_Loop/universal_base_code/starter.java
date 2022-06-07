import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("H: ");
		int height = sc.nextInt();
		System.out.println("W: ");
		int width = sc.nextInt();
		
		int arr[][] = new int[width][height];
		
		for(int i = 0; i<height;i++){
			System.out.println("");
			for(int j = 0;j<width;j++){
				System.out.print("#");
			}
		}
		
		
	}
}
