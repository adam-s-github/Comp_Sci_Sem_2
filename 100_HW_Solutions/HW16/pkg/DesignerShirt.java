package pkg;

public class DesignerShirt extends Shirt{

    public String brand;
    
    public DesignerShirt(){
        super();
        brand = "Nike";
        
    }
    
    public DesignerShirt(String brand, String material){
        super(material);
        this.brand = brand;
        
    }
    
    public static void fold(){
        
        System.out.println("Folded CAREFULLY!");
        
    }
    
}