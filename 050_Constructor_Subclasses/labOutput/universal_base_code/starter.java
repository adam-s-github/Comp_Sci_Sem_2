import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		Musician musicman = new Musician("jeff");
		Musician musicwoman = new Musician("jules",21,"trumpet");
		
		
		musicman.getName();
		musicman.practice();
		musicman.getInstrument();
		
		musicwoman.getName();
		musicwoman.perform();
		musicwoman.playInstrument();
		
	}
}
