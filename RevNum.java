import java.util.Scanner;


public class RevNum {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int r,sum=0;
        int n=scan.nextInt();
        while(n!=0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        
    }
        System.out.println(sum);
    }
    
}
