package Bac_22;

import java.util.ArrayList;
import java.util.List;

public class Pallindrome_partation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques="nitin";
		
		List<String> ll = new  ArrayList<>();
		List<List<String>> ans= new ArrayList <>();

		Pallindrome(ques,ll,ans);
		System.out.println(ans);

	}
	public static void Pallindrome(String ques,List<String> ll,List<List<String>> ans) {
		if(ques.length()==0) {
			ans.add(new ArrayList(ll));
			return;
		}
		
		for (int i = 1; i <=ques.length(); i++) {
			String s = ques.substring(0,i);
			if(isPallindrome(s)==true) {
				ll.add(s);
				Pallindrome(ques.substring(i),ll,ans);
				ll.remove(ll.size()-1);
			}
			//Pallindrome(ques.substring(i+1),ans+s+"|");
		}
	}
	public static boolean isPallindrome(String s) {
		int i=0;
		int j= s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
		
	}

}
