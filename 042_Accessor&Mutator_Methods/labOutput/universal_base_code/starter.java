import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		Dwarf[] dwarves = new Dwarf[100];
		
		String[] Dwarf_names = {"Grumpy","Dopey","Doc","Happy","Bashful","Sneezy","Sleepy"};
		int[] Dwarf_age = {1,2,3,4,5,6,7};
		
		Random rand = new Random();
		
		int age = rand.nextInt(7);
		int name = rand.nextInt(7);
		
		for(int i = 0; i<dwarves.length; i++){
			
			
			dwarves[i] = new Dwarf();
			age = rand.nextInt(7);
			name = rand.nextInt(7);
			dwarves[i].setDwarf(Dwarf_names[name],Dwarf_age[age]);
			dwarves[i].getDwarf();
			
			
		}
		
		
	}
}


class Dwarf {
	String name;
	int age;
	
	public Dwarf(){
		name = "";
		age = 0;
	}
	
	public void setDwarf(String a, int b){
		name = a;
		age = b;
	}
	
	public void getDwarf(){
		System.out.println("Dwarf " + name + " is " + age);
	}
}
