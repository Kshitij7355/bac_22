package Bac_22;

import java.util.Scanner;

public class N_queen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		boolean[][]board = new boolean[n][n];
		queen(board,0,n);
		

	}
	public static void queen(boolean[][]board,int row,int tq) {
		if(tq==0) {
			Display(board);
			return;
		}
		
		for (int col= 0; col < board.length; col++) {
			if(isitsafe(board,row,col)==true) {
				board[row][col]=true;
				queen(board,row+1,tq-1);
				board[row][col]=false;
			}
		}
	}
	public static boolean isitsafe(boolean[][] board, int row, int col) {
		//upper direction
		int r =row;
		
		while(r>=0) {
			if(board[r][col]==true) {
				return false;
				
			}
			r--;
		}
		//right direction
		r=row;
		int c= col;
		while(r>=0 && c>=0) {
			if(board[r][c]==true) {
				return false;
			}
			r--;
			c--;
		}
		//right direction
		r=row;
		c=col;
		while(r>=0 && c<board.length) {
			if(board[r][c]==true) {
				return false;
			}
			r--;
			c++;
		}
		return true;
		
	}
	public static void Display(boolean[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
	}

}
