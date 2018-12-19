import java.util.Scanner;
public class OddEven {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		if(num%2==1) {
			System.out.println("Odd");
		}
		else if(num%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Invalid");
		}
		scan.close();
	}

}
