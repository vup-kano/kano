package git;

import java.util.Scanner;

public class Coupon {
	 public static void main(String[] args) {
	 String[] color={"Spades","Clubs","Diamonds","Hearts"};
     String[] card={"ACE","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
     int[] deck=new int[52];
     for(int i=0;i<deck.length;i++){//ÿ��deck[i]��ֵ��card���±�
         deck[i]=i%13;
     }
     for(int i=0;i<deck.length;i++){//����˳��
         int index= (int)(Math.random()*deck.length);
         int tmp=deck[i];
         deck[i]=deck[index];
         deck[index]=tmp;
     }
     int res=0;
     int[] f={0,0,0,0};//0��ʾ�û�ɫû�г��ֹ�
     while (f[0] + f[1] + f[2] + f[3] != 4) {
         res++;
         int index = (int) (Math.random() * deck.length);//���ȡ��
         int tmp = index / 13;//��ɫ
         if (f[tmp] == 0) {//�����ɫû�г��ֹ�
             f[tmp] = 1;
             System.out.println(card[deck[index]] + " of " + color[tmp]);
         }
     }
     System.out.println("Number of picks: "+res);

}
}
