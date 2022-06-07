package pkg;

public class Weasel implements Pet {
    String name;
    int age;
    boolean trained;
    
    public void setName(String name){
        this.name = name;
    }       	
    
    public void setAge(int age){
        this.age = age;
    }         	
    
    public void setIsTrained(boolean trained){
        this.trained = trained;
    }
    
    public String getName(){
        return name;
    }         	
    
    public int getAge(){
        return age;
    }               
    
    public boolean getIsTrained(){
        return trained;
    }        
    
    public void interact(){
        System.out.println(name + " barks!");
    }             
    
	public void trick(){
	    if(trained){
	        System.out.println(name + " does a backflip!");
	    }
	    else{
	        System.out.println(name + "... ");
	    }
	}						
}