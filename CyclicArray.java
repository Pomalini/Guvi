import java.util.Scanner;


public class CyclicArray {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        
        int k=scan.nextInt();
        for(int i=0;i<n;i++){
        arr[i]=scan.nextInt();
    }
        for(int i=n-k;i<n;i++){
            
            System.out.print(arr[i]+" ");
            if(i==n-1){
                for(int j=0;j<n-k;j++){
                System.out.print(arr[j]+" ");
            }
            }
            
        }
        
    }
    
}
