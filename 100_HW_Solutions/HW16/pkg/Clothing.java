package pkg;

public class Clothing {
    
    public int price;
    public String producer;
    
    public Clothing(){
        
        price = 10;
        producer = "Nike";
        
    }
    
    public Clothing(int price){
        
        this.price = price;
        producer = "Nike";
        
    }
    
    public Clothing(String producer){
        
        price = 10;
        this.producer = producer;
        
    }
    
    public Clothing(int price, String producer){
        
        this.price = price;
        this.producer = producer;
        
    }
    
    public static void fold(){
        
        System.out.println("Folded!");
        
    }
    
}