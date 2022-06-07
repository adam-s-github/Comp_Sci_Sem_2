import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		Warrior x = new Warrior("John");
		Wizard y = new Wizard("Jacob");
		Fighter z = new Fighter();
		
		System.out.println(z.getName());
		System.out.println(x.getName());
		System.out.println(y.getName());
		
	}
}

class Fighter{
	String name;
	int health;
	int attack;
	Random rand = new Random();
	
	public Fighter(){
		name = "jeff";
		health = rand.nextInt(15)+10;
		attack = rand.nextInt(15)+10;
	}
	
	public Fighter(String a, int b, int c){
		name = a;
		health = b;
		attack = c;
	}
	
	public void setHealth(int hp){
		health = hp;
	}
	
	public int getHealth(){
		return health;
	}
	
	public String getName(){
		return name;
	}
	
}
