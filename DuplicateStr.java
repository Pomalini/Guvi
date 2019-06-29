
import java.util.Scanner;

public class DuplicateStr {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		String t="";
		for(int i=0;i<str.length();i++){
			if(!t.contains(str.substring(i,i+1))){
				t=t+str.charAt(i);
			}
		}
	System.out.println(t);	
	}

}
