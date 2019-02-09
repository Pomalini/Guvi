import java.io.*;
import java.util.*;

class NonRepeat2 {
	public static void main (String[] args) {
	    Scanner scan=new Scanner(System.in);
	    int n=scan.nextInt();
	    int arr[]=new int[n];
	    int count=0;
	    for(int i=0;i<n;i++){
	        arr[i]=scan.nextInt();
	    }
	    for(int i=0;i<n;i++){
	        count=0;
	        for(int j=0;j<n;j++)
	        {
	            if(arr[i]==arr[j]){
	                count++;
	            }
	           
	           
	        }
	        if(count==1){
	            System.out.println(arr[i]);
	        }
	    }
	}
}
