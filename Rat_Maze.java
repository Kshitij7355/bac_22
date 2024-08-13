package Bac_22;

import java.util.Scanner;

public class Rat_Maze {
	static boolean pass = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		char [][]maze = new char[n][m];
		for (int i = 0; i < maze.length; i++) {
			String s1 =s.next();
			for (int j = 0; j < s1.length(); j++) {
				maze[i][j]=s1.charAt(j);
			}
		}
		int[][]ans = new int[n][m];
		Ratmaze(maze,0,0,ans);
		if(pass==false) {
			System.out.println("NO PATH FOUND");
		}
		
		

	}
	
public static void Ratmaze(char[][]maze,int cr,int cc,int[][]ans) {
	if(cr==maze.length-1 && cc==maze[0].length-1&&maze[cr][cc]!='X') {
		ans[cr][cc]=1;
		display(ans);
		pass=true;
		return;
	}
	  
	if(cr<0|| cc<0 || cr>=maze.length|| cc>=maze[0].length || maze[cr][cc]=='X') {
		return;
	}
	maze[cr][cc]='X';
	ans[cr][cc]=1;
		
	    int[]r = {0,0,-1,1};
	    int[]c = {-1,1,0,0};
//	Ratmaze(maze,cr,cc-1,ans);//left
//	Ratmaze(maze,cr,cc+1,ans);//right
//	Ratmaze(maze,cr-1,cc,ans);//up
//	Ratmaze(maze,cr+1,cc,ans);//down
	    for (int i = 0; i < c.length; i++) {
			Ratmaze(maze,cr+r[i],cc+c[i],ans);
		}
	maze[cr][cc]='0';
	ans[cr][cc]=0;
    
	}

private static void display(int[][] ans) {
	for (int i = 0; i < ans.length; i++) {
		for (int j = 0; j < ans[0].length; j++) {
			System.out.print(ans[i][j]);
		}
		System.out.println();
	}
	
}

}
