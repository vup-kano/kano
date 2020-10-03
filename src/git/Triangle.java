package git;
import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("Please enter three numbers:");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		if(a+b<=c||a+c<=b||b+c<=a)
			System.out.println("Illeage input");
		else System.out.println("The perimeter is: "+(a+b+c));

	}

}
