import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		Performer perf1 = new Performer();
		Performer perf2 = new Performer("jeff",10);
		Musician music1 = new Musician();
		Musician music2 = new Musician("xylophone");
		
		perf1.getName();
		perf1.practice();
		
		perf2.getName();
		perf2.perform();
		
		music1.getName();
		music1.perform();
		music1.playInstrument();
		
		
		music1.practice();
		music1.getInstrument();
	}
}
