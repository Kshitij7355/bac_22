package Bac_22;

import java.util.Iterator;

public class Time_space_complexity {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		long start = System.currentTimeMillis();
//		for(int i=0;i<1000000;i++) {
//			
//		}
//		long end = System.currentTimeMillis();
//		System.out.println(end-start);
		System.out.println("Hey");
		int n = 123456;
		int i=0;
		while(i<n) {
			System.out.println("Hey");
			i++;
			//O(n)
		}
		while(n>0) {
			System.out.println();
			i*=2;
			i*=3;
			//0(log n at base 6)
		}
		

	}

}
