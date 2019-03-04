import java.util.*;
public class SwapOddEven
{
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    String str=scan.next();
	    char c[]=str.toCharArray();
	    char temp;
	    for(int i=0;i<c.length;i+=2){
	        temp=c[i];
	        c[i]=c[i+1];
	        c[i+1]=temp;
	    }
	    for(int i=0;i<c.length;i++)
	    System.out.print(c[i]);
	}
}
