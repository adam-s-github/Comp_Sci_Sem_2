import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Role fighter = new Fighter();
		Role[] role = new Role[3];
		role[0] = new Warrior();
		role[1] = new Wizard();
		role[2] = new Fighter();
		
		System.out.println("Fighter name: "+role[2].getName());
	}
}
