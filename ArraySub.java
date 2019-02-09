import java.io.*;
import java.util.*;

class ArraySub {
	public static void main (String[] args) {
	    Scanner scan=new Scanner(System.in);
	    int n=scan.nextInt();
	    int m=scan.nextInt();
	    int a[]=new int[n];
	    int b[]=new int[m];
	    for(int i=0;i<n;i++){
	        a[i]=scan.nextInt();
	    }
	    for(int j=0;j<m;j++){
	        b[j]=scan.nextInt();

	    }
	    int count=0;
	    for(int i=0;i<m;i++){
	        for(int j=0;j<n;j++){
	        if(b[i]==a[j]){
	            count++;
	        }
	        else{
	            continue;
	        }
	    }
	}
	if(count==m){
	    System.out.println("YES");
	}
	else{
	    System.out.println("NO");
	}
}
}
