
import java.util.Scanner;

public class CountPrimeRange {
	public static int Prime(int x){
		int flag=1;
		for(int i=2;i<=x/2;i++){
			if(x%i==0){
				flag=0;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int l=scan.nextInt();
		int count=0;
		int r=scan.nextInt();
		for(int i=l;i<=r;i++){
			if(Prime(i)==1){
				count++;
			}
		}
		System.out.println(count);
	}

}
