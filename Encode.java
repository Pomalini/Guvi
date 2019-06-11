import java.util.Scanner;

public class Encode {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		String n="";
		String a[]=new String[str.length()];
		for(int i=0;i<str.length();i++){
			a[i]=n+(char)((int)str.charAt(i)+3);
			
		}
		for(String x:a){
			System.out.print(x+"");
		}
	}

}
