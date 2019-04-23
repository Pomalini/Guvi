import java.util.Scanner;


public class PalindromeNum {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int num=n;
		int res=0,r=0;
		while(n!=0){
			r=n%10;
			res=(res*10)+r;
			n=n/10;
		}
		if(res==num){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
	}

}
