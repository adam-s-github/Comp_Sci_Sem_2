import java.util.*;

class starter {
	public static void main(String args[]) {
		
		
		
	}
	
	public static void bubbleSort(ArrayList <Integer> arr){
		
		for(int j = 0;j<9;j++){
			for(int i = 0;i<9;i++){
				if(arr.get(i)>arr.get(i+1)){
					int tmp = arr.get(i);
					arr.set(i,arr.get(i+1));
					arr.set(i+1,tmp);
				}
			}
		}
	}
	
	
	public static void selectionSort(ArrayList <Integer> arr){
		
		for(int j = 0;j<arr.size()-1;j++){
			int max = 0;
			
			for(int i = 1;i<arr.size()-j;i++){
				if(arr.get(max)<arr.get(i)){
					max = i;
				}
			}
			int tmp = arr.get(max);
			int lastPos = arr.size()-1-j;
			int valInLastPos = arr.get(lastPos);
			arr.set(max,valInLastPos);
			arr.set(lastPos,tmp);
		}
	}
	
	
	public static void insertionSort(ArrayList <Integer> arr){
		
		for(int i = 1;i<arr.size();i++){
			
			int sorter = arr.get(i);
			int j = i-1;
			
			while(j>=0 && arr.get(j)>sorter){
				arr.set(j+1, arr.get(j));
				j--;
			}
			arr.set(j+1, sorter);
		}
	}
	
	
	
}

