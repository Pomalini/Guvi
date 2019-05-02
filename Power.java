import java.util.Scanner;


public class Power {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int k=scan.nextInt();
		System.out.println((int)Math.pow(n, k));
	}

}
