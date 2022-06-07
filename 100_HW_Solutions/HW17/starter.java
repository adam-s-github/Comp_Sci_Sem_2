import pkg.*;

class starter {
	public static void main(String args[]) {
		
		int[] arr = new int[5];
		
		int count = 0;
		
		while(count<arr.length){
			arr[count] = count;
			count++;
		}
		arr[4] = 10;
		arr[4] = arr[4]-1;
		
		
		System.out.println(arr[4]);
		
		
	}
}
