import java.util.*;

public class Solution{
	public static void main(String [] args){
		MinCount cnt=new MinCount(new Integer []{1,2,7,9});
		System.out.println(cnt.count(12));
	}
}

class MinCount{
	 Integer[] coins;

	 public MinCount(Integer [] coins){
		Arrays.sort(coins,Collections.reverseOrder());
		this.coins=coins;
	 }

	 public int count(int sum){
		if(sum<0)return Integer.MAX_VALUE;
		if(sum==0)return 0;		
		int min=Integer.MAX_VALUE;
		for(int i=0; i<coins.length; i++){
			int val=count(sum-coins[i]);	
			if(val<min)min=val;
			if(val!=Integer.MAX_VALUE)break;
		}
		return min+1;
	 }
}
