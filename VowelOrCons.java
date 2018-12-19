import java.util.Scanner;

public class VowelOrCons {
	public static void main(String args[]) {
	Scanner scan=new Scanner(System.in);
    char ch=scan.next().charAt(0);
    ch=Character.toLowerCase(ch);
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
    	System.out.println("Vowel");
    }
    else if(ch>='a'&&ch<='z') {
    	System.out.println("Consonant");
    }
    else {
    	System.out.println("Invalid");
    }
    

}
}
