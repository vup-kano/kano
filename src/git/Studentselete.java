package git;
import java.util.Scanner;
class info{
	String name;
	double score;
}
public class Studentselete {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Please enter the number :");
		info[] jie =new info[100];
		int n=input.nextInt();
		for(int i=0;i<n;++i) {
			jie[i]=new info();
			jie[i].name=input.next();
			jie[i].score=input.nextDouble();
		}
		for(int i=0;i<n;++i) {
			for(int j=i;j<n;++j) {
				if(jie[i].score<jie[j].score) {
					double sc;
					String sd;
					sc=jie[i].score;
					jie[i].score=jie[j].score;
					jie[j].score=sc;
					sd=jie[i].name;
					jie[i].name=jie[j].name;
					jie[j].name=sd;
				}
			}
		}
		for(int i=0;i<n;++i) {
			System.out.println(jie[i].name+" "+jie[i].score);
		}
	}

}
