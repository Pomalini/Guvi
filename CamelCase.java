
import java.util.Scanner;

public class CamelCase {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		String a[]=str.split(" ");
		String s="",res="";
		for(int i=0;i<a.length;i++){
			s=a[i].toLowerCase();
			for(int j=0;j<s.length();j++){
				if(j==0){
				res+=s.substring(i,i+1).toUpperCase();
				}
				else{
				res+=s.substring(i,i+1);
			}
			}
			res+=" ";
			
		}
		System.out.println(res);
	}

}
