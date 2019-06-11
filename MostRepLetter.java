import java.util.Scanner;

public class MostRepLetter {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		int max=0,count=0;
		char val='\000';
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<str.length();j++){
				if(str.charAt(i)==str.charAt(j)){
					count++;
				}
			}
			if(count>max){
				max=count;
				val=str.charAt(i);
			}
		}
		System.out.println(val);
		
	}

}
