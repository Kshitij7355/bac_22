package Bac_22;

import java.util.ArrayList;
import java.util.List;

public class coin_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]coin= {2,1,3,5};
		int amount=4;
		List<Integer> ll = new  ArrayList<>();
		List<List<Integer>> ans= new ArrayList <>();
		Con(coin,amount,ll,0,ans);
		System.out.println(ans);

	}
	public static void Con(int[]coin,int amount, List<Integer> ll,int idx,List<List<Integer>> ans) {
		if(amount==0) {
			ans.add(new ArrayList<>(ll));
			
			return;
		}
		
		for (int i = idx; i < coin.length; i++) {
			if(amount>=coin[i]) {
				ll.add(coin[i]);
				Con(coin,amount-coin[i],ll,i,ans);
				ll.remove(ll.size()-1);
			}
			
		}

	}

}
