import java.io.*;
import java.util.*;

class SecLarge {
	public static void main (String[] args) {
	    Scanner scan=new Scanner(System.in);
	    int n=scan.nextInt();
	    int k=scan.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=scan.nextInt();
	        
	    }
	    Arrays.sort(arr);
	    System.out.println(arr[n-k]);
	}
}
