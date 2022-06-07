package pkg;
import java.util.Scanner;
import java.util.Random;


public class Actor extends Performer {
	String type;
	
	public Actor(){
		this.type = "theater";
	}
	
	public Actor(String type){
		this.type = type;
	}
	
	public void practice(){
		System.out.println(type + " practices in a dramatic way.");
	}
	
	public void perform(){
		System.out.println(type + " bombs in a dramatic way.");
	}
	
	public void monologue(){
		System.out.println("woe is me :( .");
	}

}

