import java.util.Scanner;


public class LastN {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		int n=scan.nextInt();
		String res=str.substring(str.length()-n, str.length());
		System.out.println(res);
	}

}
