import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		Performer one = new Performer("james");
		Performer two = new Performer();
		Musician three = new Musician();
		Apprentice four = new Apprentice();
		
		one.toString();
		one.equals(two);
		three.toString();
		four.toString();
		
		
	}
}
