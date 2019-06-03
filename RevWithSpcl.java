import java.util.Scanner;

public class Rev {
	public static void main(String args[]){
	Scanner scan=new Scanner(System.in);
	String str=scan.next();
	String res="";
	String end="";
	for(int i=str.length()-1;i>=0;i--){
		if(Character.isAlphabetic(str.charAt(i)) || Character.isDigit(str.charAt(i))){
			
			res=res+str.substring(i, i+1);
		}
	}
	
	for(int i=0,j=0;i<str.length();i++){
		if(Character.isAlphabetic(str.charAt(i)) || Character.isDigit(str.charAt(i))){
			end+=res.substring(j,j+1);
			j++;
		}
		else{
			end+=str.charAt(i);
		}
	}
	System.out.println(end);
	
	
}
}
