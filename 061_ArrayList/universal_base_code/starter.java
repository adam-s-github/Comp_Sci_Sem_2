import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;


class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Size: ");
		int size = sc.nextInt();
		
		ArrayList <String> arr = new ArrayList<String>(size);
		
		int count1 = 1;
		int count = 0;
		
		while(count<size){
			arr.add(count,"cookie " + count1);
			count1++;
			count++;
		}
		
		int count2 = 0;
		
		while(count2<size){
			System.out.println(arr.get(count2));
			count2++;
		}
		
	}
}
