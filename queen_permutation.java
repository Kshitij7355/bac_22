package Bac_22;

public class queen_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method 
        int n=4;
        int tq=2;//total queen
        boolean[] board = new  boolean[n];
        permutation(board,tq,0,"");
        
        

	}
	public static void permutation(boolean[]board,int tq,int qpsf,String ans) {
		if(tq==qpsf) {
			System.out.println(ans);
		}
		
		for (int i = 0; i < board.length; i++) {
			if(board[i]==false) {
				board[i]=true;
				permutation(board,tq,qpsf+1,ans+"b"+i+"q"+qpsf);
				board[i]=false;
			}
		}
	}

}
