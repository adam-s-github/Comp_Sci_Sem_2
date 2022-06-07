import pkg.*;

class starter {
	public static void main(String args[]) {
		
		
		System.out.println(specialSquare(8));
		
	}
	
	public static int special(int num){
		
		int count = num-1;
		
		while(count>0){
			num = num + count;
			count--;
		}
		return num;
		
	}
	
	public static int square(int num){
		
		double dub = num;
		double squarert = Math.sqrt(dub);
		
		if(squarert%1!=0){
			return (int)0.0;
		}
		else{
			int end = (int)squarert;
			return end;
		}
		
	}
	
	public static int specialSquare(int num){
		
		int s = special(num);
		int n = square(s);
		
		if(n==0){
			System.out.println("...");
		}
		else{
			System.out.println(s + " is the sum of the integers 1 to " + num +" and is the perfect square " + s);
		}
		return n;
	
		
	}
}
