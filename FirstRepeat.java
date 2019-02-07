import java.io.*;
import java.util.*;
class FirstRepeat {
	public static void main (String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=scan.nextInt();
		}
		int count=0;
		for(int i=0;i<n;i++){
		    for(int j=i+1;j<n;j++){
		        if(arr[i]==arr[j]){
		            count=1;
		            System.out.println(arr[i]);
		            break;
		    }
		}
		if(count>=1){
		break;
	}
		}
}
}
