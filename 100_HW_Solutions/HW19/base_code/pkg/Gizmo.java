package pkg;

public class Gizmo{ 
   
   public String maker;
   public boolean isE;
   public double cost;
   
   public Gizmo(String maker, boolean isE, double cost){
      this.maker = maker;
      this.isE = isE;
      this.cost = cost;
   }
   
   public String getMaker(){
      return maker;
   }
   
   public boolean isElectronic(){
      return isE;
   }
   
   public double getCost(){
      return cost;
   }
   
   
   public String toString(){
   	return "" + maker + " " + isE + " " + cost;
   }
   
}
