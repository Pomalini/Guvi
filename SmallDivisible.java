import java.util.Scanner;

public class SmallDivisible {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		int mul=0;
		for(int i=1;i<=10;i++){
			mul=n2*i;
			if(mul%n1==0){
				System.out.println(n2*i);
				break;
			}
		}
	}

}
