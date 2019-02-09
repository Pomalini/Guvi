import java.util.Scanner;


public class Holiday {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        String res=str.toLowerCase();
        if(res.equals("saturday") || res.equals("sunday")){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        
    }
    
}
