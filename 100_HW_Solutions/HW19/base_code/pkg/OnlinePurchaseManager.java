package pkg;
import java.util.ArrayList;



public class OnlinePurchaseManager{
   
   
   public ArrayList<Gizmo> purchases;
   
   public OnlinePurchaseManager(){
     
   }
   
   public void add(String maker, boolean isE, double cost){
      this.maker = maker;
      this.isE = isE;
      this.cost = cost;
   }
   
   public int countElectronicsByMaker(String a){
      
      int count = purchases.size();
      
      int countABC = 0;
      int countXYZ = 0;
      int countlmnop = 0;
      
      if(a.equals("ABC")){
         for(int i = 0;i<count;i++){
            if(purchases.get(i).equals("ABC")){
               countABC++;
            }
         }
         return countABC;
      }
      
      if(a.equals("XYZ")){
         for(int i = 0;i<count;i++){
            if(purchases.get(i).equals("XYZ")){
               countXYZ++;
            }
         }
         return countXYZ;
      }
      
      if(a.equals("lmnop")){
         for(int i = 0;i<count;i++){
            if(purchases.get(i).equals("lmnop")){
               countlmnop++;
            }
         }
         return countlmnop;
      }
      
   }
   
   public boolean hasAdjacentEqualPair(int i,int j){
      Gizmo a = purchases.get(i);
      Gizmo b = purchases.get(j);
      if(a.equals(b)){
         return true;
      }
      else{
         return false;
      }
   }
   
   public Gizmo getCheapestGizmoByMaker( String mkr ){
   	
   }
   
   
   public String toString()
   {
   	return "" + purchases;
   }
}
