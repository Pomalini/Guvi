

import java.util.Scanner;

public class Balancing {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		int c=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='('){
				c++;
			}
			if(s.charAt(i)==')'){
				c--;
			}
		}
		if(c==0)
		System.out.println("yes");
		else
			System.out.println("no");
	}

}
