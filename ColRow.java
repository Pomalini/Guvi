import java.util.Scanner;

public class ColRow {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		int a[][]=new int[n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				a[i][j]=scan.nextInt();
			}
		}
		int row=0;
		int col=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(a[i][j]==0){
					row=i;
					col=j;
				}
			}
			
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(i==row ||j==col){
					a[i][j]=0;
				}
				if(i==col ||j==row){
					a[i][j]=0;
				}
				
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
			
		}
		
	}

}
