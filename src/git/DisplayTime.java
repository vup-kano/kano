package git;
import java.util.Scanner;
public class DisplayTime {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer for second: ");
		int second = input.nextInt();
		int minutes=second /60;
		int remainingSeconds=second % 60;
		System.out.println(second+ " second is "+minutes
				+" minute and "+remainingSeconds + " second");
}
	}
