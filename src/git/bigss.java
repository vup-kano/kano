package git;
import java.util.Scanner;
public class bigss {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		boolean[] kg=new boolean [101];
		for(int i=1;i<=100;++i) {kg[i]=true;}
		for(int i=2;i<=100;++i) {
			for(int j=i;j<=100;j+=i) {kg[j]=!kg[j];}
		}
		for(int i=1;i<=100;++i) {if(kg[i]==true)System.out.print(i+" ");}
	}

}
