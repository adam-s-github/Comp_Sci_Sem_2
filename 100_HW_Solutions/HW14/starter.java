import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		//Dog Snoopy = new Dog();						// Default Constructor
		//Dog Snoopy2 = new Dog(36);					// Age Constructor
		//Dog Snoop3 = new Dog(true);					// Trained Constructor
		//Dog Toto = new Dog("Toto");					// Name Constructor
		//Dog Clifford = new Dog("Clifford", true);	// Name, Trained Constructor
		//Dog Scooby = new Dog("Scooby", 50, false);	// Name, Age, Trained Constructor

		//Cat Felix = new Cat("Felix", 100, true);	// Name, Age, Trained Constructor


		//Clifford.trick();							// Trained trick
		//Scooby.trick();								// Untrained trick
		//Felix.trick();
		
		Weasel[] weasels = new Weasel[5];
		int count1 = 0;
		
		String[] names = {"Jeff","John","Jacob","Terry","Jerry"};
		
		while(count1<weasels.length){
			
			weasels[count1] = new Weasel();
			weasels[count1].setName(names[count1]);
			weasels[count1].interact();
			count1++;
			
		}
		
		System.out.println();
		
		weasels[0].setIsTrained(true);
		weasels[3].setIsTrained(true);
		
		int count2 = 0;
		
		while(count2<weasels.length){
			
			weasels[count2].trick();
			count2++;
			
		}
		
		
		
		
	}
}