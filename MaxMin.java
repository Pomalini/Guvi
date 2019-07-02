
import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scan.nextInt();
		}
		Arrays.sort(arr);
		for(int i=arr.length-1,j=0;i>=0;i--,j++){
			b[j]=arr[i];
		}
		for(int i=0;i<=n/2;i++){
			if(i==n/2){
				System.out.print(b[i]);
			}
			else
			System.out.print(b[i]+" "+arr[i]+" ");
		}
	}

}
