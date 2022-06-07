import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util.*;


class starter {
	public static void main(String args[]) {
		
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Size: ");
		int size = sc.nextInt();
		
		ArrayList<Integer>arr1 = new ArrayList<Integer>(size);
		
		for(int j = 0;j<size;j++){
			arr1.add(rand.nextInt(10));
		}
		
		toStringArrayList(arr1);
		System.out.println("");
		System.out.println(getArrayListMin(arr1));
		
		
	}
	
	public static void toStringArrayList(ArrayList<Integer> arr){
		
		for(int i = 0;i<arr.size();i++){
			System.out.print(arr.get(i));
		}
		
	}
	
	public static double getAverageArrayList(ArrayList<Integer> arr){
		
		double sum = 0;
		double avg = 0;
		
		for(int i = 0;i<arr.size();i++){
			sum = sum + arr.get(i);
		}
		
		avg = sum/arr.size();
		return avg;
	}
	
	public static int getArrayListMax(ArrayList<Integer> arr){
		
		int max = 0;
		int count = 0;
		
		for(int i = 0;i<arr.size();i++){
			if(arr.get(i)>max){
				max = arr.get(i);
			}
		}
		return max;
	}
	
	public static int getArrayListMin(ArrayList<Integer> arr){
		
		int min = 0;
		int count = 0;
		
		for(int i = 0;i<arr.size()-1;i++){
			if(arr.get(i)<arr.get(i+1)){
				min = arr.get(i);
			}
		}
		return min;
	}
}
