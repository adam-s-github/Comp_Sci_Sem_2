package pkg;
import java.util.Scanner;
import java.util.Random;


public class Combinatronics {
	int n;

	public int factorial(int n) {
		
		if(n == 1){
			return n;
		}
	
		if(n!=1){
			int count = n - 1;
			
			while(true){
				n = (n)* count;
		
				if(count == 1){
					return n;
				}
			count--;
			}
		}
		return n;
	}
	
	public int numCombinations(int n, int r){
		int comb;
		int fn = factorial(n);
		int fr = factorial(r);
		int fnr = n - r;
		int ffnr = factorial(fnr);
		
		if(r >= n){
			comb = 0;
			return n;
		}
		
		else{
			comb = fn/(fr*ffnr);
			System.out.println(comb);
			return n;
		}
	}
}