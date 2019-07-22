

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EvenFactors {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		ArrayList<Integer> l=new ArrayList<Integer>();
		for(int i=2;i<=n;i++){
			if(n%i==0 && i%2==0){
				l.add(i);
			}
		}
		System.out.println(l.toString().replace("["," ").replaceAll("]", " ").replace(","," ").trim());
	}

}
