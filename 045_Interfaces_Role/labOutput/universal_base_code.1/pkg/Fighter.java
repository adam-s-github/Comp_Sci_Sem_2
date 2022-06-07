import java.util.Scanner;
import java.util.Random;


public class Fighter implements Role{
	
	String name;
	int health;
	int attack;
	Random rand = new Random();
	
	public Fighter(){
		name = "jeff";
		health = 0;
		attack = 0;
	}
	
	public Fighter(String a, int b, int c){
		name = a;
		health = b;
		attack = c;
	}
	
	public void setHealth(int health){
		this.health = health;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getHealth(){
		return health;
	}
	
	public String getName(){
		return name;
	}
	
	public void attack(Wizard a){
		int b = rand.nextInt(15)+1;
		int c = a.getHealth();
		c = c-b;
	}
	
	public void attack(Warrior a){
		int b = rand.nextInt(15)+1;
		int c = a.getHealth();
		c = c-b;
	}
}
