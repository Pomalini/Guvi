import java.util.Scanner;


public class Unique {
    public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    int arr[]=new int[n];
    int count=0;
    for(int i=0;i<n;i++) {
       arr[i]=scan.nextInt();
       
}
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]==arr[j]){
                count++;
                System.out.print(arr[i]+" ");
            }
            else{
                continue;
            }
        }
    }
    if(count==0){
        System.out.println("unique");
    }
    }
    
    
    
}
