package logic;

import java.util.Scanner;

public class Isomorphic {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s1=scan.next();
		String s2=scan.next();
		String a="";
		String b="";
		boolean flag=false;
		int c1=0;
		int c2=0;
		if(s1.length()!=s2.length()){
			System.out.println("No");
		}
		else{
		for(int i=0;i<s1.length();i++){
			if(!a.contains(s1.substring(i,i+1))){
				a+=s1.substring(i,i+1);
			}
			if(!b.contains(s2.substring(i,i+1))){
				b+=s2.substring(i,i+1);
			}
		}// <---removing duplicates
		for(int i=0;i<a.length();i++){
			c1=0;
			c2=0;
			for(int j=0;j<s1.length();j++){
				if(a.charAt(i)==s1.charAt(j)){
					c1++;
				}
				if(b.charAt(i)==s2.charAt(j)){
					c2++;
				}
			}
			if(c1==c2){
				flag=true;
				continue;
			}
			else{
				System.out.println("No");
				break;
			}
		}
		if(flag){
			System.out.println("Yes");
		}
	}
	}

}
