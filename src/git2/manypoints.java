package git2;
import java.util.Scanner;
public class manypoints {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of points:");
		int n=input.nextInt();
		points[] p=new points[n]; 
		for(int i=0;i<n;i++)
    	{
    		p[i]= new points();
    	}
		double sum1=0,sum2=0;
		System.out.print("Enter the condinates of points:");
		for (int i=0;i<n;++i) {
			p[i].x=input.nextDouble();
			p[i].y=input.nextDouble();
		}
		for(int i=0;i<n;++i) {
			sum1+=p[i].x*p[(i+1)%n].y;
			sum2+=p[i].y*p[(i+1)%n].x;
			}
		System.out.print("The total area is "+Math.abs(0.5*(sum1-sum2)));
	}

}
class points{
	double x,y;
	points(){
		this.x=x;
		this.y=y;
	}
}
