package git;
import java.util.Scanner;
public class HBlist2 {
	public static int[] merge(int[] list1,int[] list2) {
		int[] merges=new int [list1.length+list2.length];
    	int flag=0;
    	int s=0;
    	int i=0;
    	while(i<list1.length&&flag<list2.length) {
    		if(list1[i]<list2[flag]) {
    			merges[s]=list1[i];
    			s++;
    			i++;
    		}
    		else {
    			merges[s]=list2[flag];
    			s++;
    			flag++;
    		}
    	}
    	while(i<list1.length) {
    			merges[s]=list1[i];
    			s++;
    			i++;
    	}
    	while(flag<list2.length) {
			merges[s]=list2[flag];
			s++;
			flag++;
	}
	
    	return merges;
    }
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("Enter list1 size and contents: ");
		int a=input.nextInt();
		int [] list1=new int[a];
		for(int i=0;i<a;++i) {
			list1[i]=input.nextInt();
		}
		System.out.print("Enter list2 size and contents: ");
		int b=input.nextInt();
		int [] list2=new int[b];
		int [] list=new int[a+b];
		for (int i=0;i<b;++i) {
			list2[i]=input.nextInt();
		}
		System.out.print("list1 is ");
		for(int i=0;i<a;++i) {System.out.print(list1[i]+" ");}
		System.out.println();
		System.out.print("list2 is ");
		for(int i=0;i<b;++i) {System.out.print(list2[i]+" ");}
		System.out.println();
        list=merge(list1,list2);
        System.out.print("The merged list is ");
        for(int i=0;i<a+b;++i) {System.out.print(list[i]+" ");}
	}

}
