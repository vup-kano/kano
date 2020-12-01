package git2;
import java.util.Scanner;
import java.util.ArrayList;
public class remove {
	public static void removeDuplicate(ArrayList<Integer> list) {
		ArrayList<Integer> listcopy=new ArrayList<>();
		for(int i=0;i<list.size();++i) {
			if(i==list.indexOf(list.get(i)))
				listcopy.add(list.get(i));
		}
		System.out.print("The distinct integers are ");
		for(int i=0;i<listcopy.size();++i) {
			System.out.print(listcopy.get(i)+" ");
		}
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<>();
		System.out.print("Enter 10 integers: ");
		for(int i=0;i<10;++i) {
			list.add(input.nextInt());
		}
		removeDuplicate(list);

	}

}
