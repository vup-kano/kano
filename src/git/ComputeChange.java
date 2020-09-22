package git;
import java.util.Scanner;
public class ComputeChange {
	public static void main (String[] args) {
		   Scanner input = new Scanner(System.in);
		   System.out.print("Enter an amount in double, for example 11.56: ");
		   double amout = input.nextDouble();
		   int remainingAmout = (int)(amout *100);
		   int numberOfOneDollars= remainingAmout/100;
		   remainingAmout=remainingAmout % 100;
		   int numberOfQuarters=remainingAmout/25;
		   remainingAmout=remainingAmout % 25;
		   int numberOfDimes=remainingAmout / 10;
		   remainingAmout= remainingAmout % 10;
		   int numberOfNickels =remainingAmout /5;
		   remainingAmout=remainingAmout % 5;
		   int numberOfPennies=remainingAmout;
		   System.out.println("Your amout "+ amout + " consists of");
		   System.out.println(" "+ numberOfOneDollars + " dollars");
		   System.out.println(" "+ numberOfQuarters + " quarters ");
		   System.out.println(" "+ numberOfDimes + " dimes");
		   System.out.println(" "+ numberOfNickels + " nickels");
		   System.out.println(" "+ numberOfPennies + " pennies");
		   
}
}