package Bac_22;

public class coin_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]coin= {2,1,3,5};
		int amount=4;
		Con(coin,amount,"");

	}
	public static void Con(int[]coin,int amount, String ans) {
		if(amount==0) {
			System.out.println(ans);
			return;
		}
		
		for (int i = 0; i < coin.length; i++) {
			if(amount>=coin[i]) {
				Con(coin,amount-coin[i],ans+coin[i]);
			}
			
		}
	}

}
