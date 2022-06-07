package pkg;
import java.util.Scanner;
import java.util.Random;


public class BatteryCharger {
	
	public int[] rateTable;
	
	int startHour;
	int chargetime;
	
	

	public int getChargingCost(int startHour, int chargeTime) {
		
		int cost = 0;
		
		cost = rateTable[startHour]+chargetime;
		
		return cost;
	}
	
	public int getChargeStartTime(int chargetime){
		
		int getStartTime = 0;
		
		int cost1 = getChargingCost(0,chargetime);
		int cost = 0;
		
		int count = 24;
		int best = 0;
		
		for(int i = 0; i < count; i++){
			cost2 = getChargingCost(i,chargetime);
			if(cost2 < cost1){
				return cost2
			}
		}
		return cost1;
	}

}

