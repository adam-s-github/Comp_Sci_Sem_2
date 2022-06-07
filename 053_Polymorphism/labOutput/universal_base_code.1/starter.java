import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		
		Performer[] arr = new Performer[4];
		
		arr[0] = new Performer("jeff");
		arr[1] = new Musician("jarvis", "cello");
		arr[2] = new Actor("jeff");
		arr[3] = new Apprentice("jeff", 12);
		
		arr[0].perform();
		arr[0].practice();
		
		((Musician)arr[1]).perform();
		((Musician)arr[1]).practice();
		
		((Apprentice)arr[3]).pau();
		((Musician)arr[3]).playInstrument();
		
		((Actor)arr[2]).monologue();
		arr[0].perform();
	}
}
