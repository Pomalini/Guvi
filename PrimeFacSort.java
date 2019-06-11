import java.util.Scanner;

public class PrimeFacSort {
	public static int prime(int x){
		int flag=1;
		for(int i=2;i<=x/2;i++){
			if(x%i==0){
				flag++;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int res=0;
		for(int i=1;i<=num;i++){
			if(num%i==0){
				res=prime(i);
			
			if(res==1 && i!=1){
				System.out.print(i+" ");
			}
			}
		}
	}

}
