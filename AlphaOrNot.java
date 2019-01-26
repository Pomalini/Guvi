import java.util.Scanner;


public class AlphaOrNot {

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        char a=scan.next().charAt(0);
        if((a>='a' &&a<='z') || (a>'A' && a<='Z')){
        System.out.println("Alphabet");
    }
        else{
                System.out.println("No");
                }
        
        
        
    }
    
}
