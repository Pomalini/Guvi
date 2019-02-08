import java.io.*;
import java.util.*;

class AddK {
	public static void main (String[] args) {
	    Scanner scan=new Scanner(System.in);
	    int n=scan.nextInt();
	    int k=scan.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=scan.nextInt();
	    }
	    for(int i=0;i<n;i++){
	        for(int j=i+1;j<n;j++){
	        if(arr[i]+arr[j]==k){
	            System.out.println("YES");
	            break;
	           
	        }
	        else{
	            System.out.println("NO");
	            break;
	        }
	    }
	    break;
	}
}
}
