import java.util.Scanner;


public class SumOfSquares {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int r=0;
        int sq=0;
        while(num!=0){
            r=num%10;
            sq=sq+(r*r);
            num=num/10;
        }
        System.out.println(sq);
        
        
    }
    
}
