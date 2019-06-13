import java.util.Scanner;

public class ProductArr {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scan.nextInt();
		}
		int pro=1;
		for(int i=0;i<n;i++){
			pro=1;
			for(int j=0;j<n;j++){
				if(i!=j){
					pro=pro*arr[j];
				}
			}
			System.out.print(pro+" ");
		}
		
	}
}

