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
			
		}
		
		String dwarf = "";
		int count = 0;
		boolean truthcount = false;
		for(int j = 0; j<dwarves.length; j++){
			dwarf = dwarves[j].getDwarf();
			truthcount = dwarves[1].isNameSame(dwarf);
			if(truthcount == true){
				count++;
			}
			
			
		}
		System.out.println("Duplicates: "+count);
		
		
		
		
		
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
	
	public String getDwarf(){
		return name;
	}
	
	public boolean isNameSame(String c){
		int count = 0;
		if(c.equals(name)){
			return true;
		}
		else{
			return false;
		}
	}
	
	

}
