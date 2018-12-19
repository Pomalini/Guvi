import java.util.Scanner;

public class PosNeg {
	public static void main(String args[]) {
     Scanner scan=new Scanner(System.in);
     int num=scan.nextInt();
     if(num>0) {
    	 System.out.println("Positive");
     }
     else if(num<0) {
    	 System.out.println("Negative");
     }
     else {
    	 System.out.println("Zero");
     }

}
}
