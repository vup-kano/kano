package git2;
import java.util.Scanner;
import java.util.ArrayList;
public class Stringss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		ArrayList<String> list=new ArrayList<>();
		String s;
		s=input.next();
		System.out.print(toCharacter(s));;
	}

	public static ArrayList<Character> toCharacter(String s) {
		ArrayList<Character> list=new ArrayList<>();
		for (int i=0;i<s.length();++i) {
			list.add(s.charAt(i));
		}
		
		
		return list;
		
	}
}
