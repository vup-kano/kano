package git2;
import java.util.List;
import java.util.ArrayList;
public class bookdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book>books=new ArrayList<Book>();
		Book book1=new Book("#31234563","�����Ƕ�һ�����������塷",38.4,"hz");
		Book book2=new Book("#53453453","�������ȫ����·����",14.38,"bj");
		Book book3=new Book("#53453434","����л�Լ��Ĳ�������",52.8,"nj");
		Book book4=new Book("#83343413","���ҵ����벻�����Լ���",37.84,"sz");
		Book book5=new Book("#34535435","����ֵ��ӵ����õ�һ�С�",66,"wh");
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);
		for(Book bk:books){
			System.out.println(bk.getNumber()+" "+bk.getName()+" "+bk.getMoney()+" "+bk.getFrom());
		}
	}

}
class Book {
	private String number;
	private String name;
	private double money;
	private String from;
	public Book() {}
	public Book(String number,String name,double money,String from) {
		this.number = number;
		this.name = name;
		this.money = money;
		this.from = from;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
}