import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String str="kabali";
		char t[]=str.toCharArray();
		Arrays.sort(t);
		String m1=new String(t);
		int n=scan.nextInt();
		String s[]=new String[n];
		for(int i=0;i<n;i++){
			s[i]=scan.next();
		}
		int count=0;
		for(int i=0;i<n;i++){
			if(s[i].length()==str.length()){
				
				char c[]=s[i].toCharArray();
				Arrays.sort(c);
				String m2=new String(c);
			if(m1.equals(m2)){
				count++;
			}
			
		}
		}
		System.out.println(count);
	}

}
