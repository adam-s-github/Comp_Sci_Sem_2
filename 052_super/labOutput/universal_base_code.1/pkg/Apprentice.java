package pkg;
import java.util.Scanner;
import java.util.Random;


public class Apprentice extends Musician {
	
	String school;
	int yoe;
	
	public Apprentice(){
		school = "CV";
		yoe = 0;
	}
	
	public Apprentice(String school, int yoe){
		this.school = school;
		this.yoe = yoe;
	}
	
	public Apprentice(String instrument, String school, int yoe){
		super(instrument);
		this.school = school;
		this.yoe = yoe;
		
	}
	
	public Apprentice(String instrument, int age, String name, String school, int yoe){
		super(name,age,instrument);
		this.school = school;
		this.yoe = yoe;
		
	}
	
}
