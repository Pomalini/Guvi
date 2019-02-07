import java.util.Scanner;

public class LargeNum {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int temp,count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    
                }
                
            }
            if(arr[i]==0){
                    count++;
                }
        }
        if(count!=n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
        
    }
        else{
            System.out.println("0");
            
        }
    
}
}
