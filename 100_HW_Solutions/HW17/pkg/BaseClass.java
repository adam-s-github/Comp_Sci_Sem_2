package pkg;

public class Robot {
	
	public int[] hall;
	public int pos;
	public boolean facingRight;
	
	public boolean forwardMoveBlocked(){
		if(pos == hall.length-1){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void move(){
		
		if(hall[pos]==0){
			if(forwardMoveBlocked){
				pos--;
			}
			pos++;
		}
		else{
			while(hall[pos]>0){
				hall[pos] = hall[pos]-1;
			}
		}
			
	}
	
	public int clearHall(){
		
		int moves = 0;
		int sum = 0;
		
		for(int i = 0; i < hall.length; i++){
			sum = hall[i] + sum;
		}
		
		while(sum > 0){
			hall.move();
			move++;
		}
		
		return moves;
	}
	
	
}
