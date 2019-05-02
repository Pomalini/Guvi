import java.util.Scanner;


public class CapitalFirst {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		String arr[]=str.split(" ");
		String res="";
		for(int i=0;i<arr.length;i++){
			res=arr[i].substring(0, 1).toUpperCase();
			System.out.print(res+arr[i].substring(1)+" ");
		}
		
	}

}
