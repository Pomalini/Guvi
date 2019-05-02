import java.util.Scanner;


public class NthOdd {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int k=scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();
		}
		int count=0;
		for(int i=0;i<n;i++){
			if(a[i]%2==1){
				count++;
			}
			if(count==k){
				System.out.println(a[i]);
				break;
			}
			
		}
	}

}
