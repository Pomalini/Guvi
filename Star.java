
import java.util.*;

public class Star
{
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    int n=scan.nextInt();
	    ArrayList<Integer> a=new ArrayList<Integer>();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=scan.nextInt();
	    }
	    int count=0;
	    for(int i=0;i<n;i++){
	        count=0;
	        for(int j=i+1;j<n;j++){
	            if(arr[i]>arr[j]){
	                count++;
	            }
	            if(count==n-(i+1)){
	                a.add(arr[i]);
	                
	            }
	                
	                
	        }
	    }
	    a.add(arr[n-1]);
	    for(int x:a){
	        System.out.print(x+" ");
	    }
	    System.out.println();
	    System.out.println(a.get(0));
	    
	}
}



