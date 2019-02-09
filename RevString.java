import java.util.Scanner;


public class RevString {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        String res="";
        for(int i=str.length()-1;i>=0;i--){
           res=res+str.charAt(i);
        }
        System.out.println(res);
        
        
    }
    
}
