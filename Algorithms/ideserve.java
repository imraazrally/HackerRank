import java.util.*;

public class Solution{
	public static void main(String [] args){
		Denom cash=new Denom(new int[]{20,10,5,1});
		cash.printNumberOfWays(20);
	}
}

class Denom{
	int [] denoms;
	int [] state;	

	public Denom(int [] denoms){
		this.denoms=denoms;
		this.state=new int[denoms.length];
	}

	public void printNumberOfWays(int amount){
		numberOfWays(amount);
	}
	
	private void numberOfWays(int amount){
		if(amount<0)return;
		if(amount==0){
			System.out.println(Arrays.toString(state));
			return;
		}
		for(int i=0; i<denoms.length; i++){
			state[i]++;
			amount-=denoms[i];
			numberOfWays(amount);
			amount+=denoms[i];
			state[i]--;
		}
	}
}
