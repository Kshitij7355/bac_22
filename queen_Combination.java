package Bac_22;

public class queen_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int n=4;
        int tq=2;//total queen
        boolean[] board = new  boolean[n];
        Combination(board,tq,0,"",0);
        
        

	}
	public static void Combination(boolean[]board,int tq,int qpsf,String ans,int idx) {
		if(tq==qpsf) {
			System.out.println(ans);
		}
		
		for (int i = idx; i < board.length; i++) {
			if(board[i]==false) {
				board[i]=true;
				Combination(board,tq,qpsf+1,ans+"b"+i+"q"+qpsf,i+1);
				board[i]=false;
			}
		}
		

	}

}
