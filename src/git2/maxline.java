package git2;
import java.util.Scanner;
import java.util.ArrayList;
public class maxline {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		ArrayList maxline=new ArrayList();
		ArrayList maxrow=new ArrayList();
		System.out.print("Enter the array dize n: ");
		int n=input.nextInt();
		int [][] a= new int[n][n];
		int []b=new int[n];
		int []c=new int[n];
		int cnt=0,sum=0;
		for(int i=0;i<n;++i) {
			for(int j=0;j<n;++j) {
				a[i][j]=(int)(Math.random()*2);
			}
		}
		System.out.println("The random array is ");
		for(int i=0;i<n;++i) {
			for(int j=0;j<n;++j) {
				System.out.print(a[i][j]);
				b[i]+=a[i][j];
			}
			System.out.println("");
			if(b[i]>cnt) {
				cnt=b[i];
				maxline.clear();
				maxline.add(i);
				}
			else if(b[i]==cnt)
				maxline.add(i);
		}
		for(int j=0;j<n;++j) {
			for(int i=0;i<n;++i) {
				c[j]+=a[i][j];
			}
			if(c[j]>sum) {
				sum=c[j];
				maxrow.clear();
				maxrow.add(j);
				}
			else if(c[j]==sum)
				maxrow.add(j);
		}
		System.out.print("The largesr row index: ");
		for (int i=0;i<maxline.size()-1;++i)
			System.out.print(maxline.get(i)+",");
		System.out.println(maxline.get(maxline.size()-1));
		System.out.print("The largesr column index: ");
		for (int i=0;i<maxrow.size()-1;++i)
			System.out.print(maxrow.get(i)+",");
		System.out.println(maxrow.get(maxrow.size()-1));
		
	}
	
	
}
