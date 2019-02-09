import java.util.Scanner;


public class RemoveVow {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        StringBuffer sb=new StringBuffer(str);
        sb.reverse();
        String str1=new String(sb);
        for(int i=0;i<str1.length();i++){
        if(str1.charAt(i)=='a' ||str1.charAt(i)=='e'||str1.charAt(i)=='i'||str1.charAt(i)=='o'||str1.charAt(i)=='u'){
            continue;
        }
        else{
            System.out.print(str1.charAt(i));
        }
    }
        
    }
    
}
