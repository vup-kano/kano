package git2;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
public class bookdemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Books> books=new HashMap<String,Books>();
		books.put("#31234563", new Books("#31234563","�����Ƕ�һ�����������塷",38.4,"hz"));
		books.put("#53453453", new Books("#53453453","�������ȫ����·����",14.38,"bj"));
		books.put("#53453434", new Books("#53453434","����л�Լ��Ĳ�������",52.8,"nj"));
		books.put("#83343413", new Books("#83343413","���ҵ����벻�����Լ���",37.84,"sz"));
		books.put("#34535435", new Books("#34535435","����ֵ��ӵ����õ�һ�С�",66,"wh"));		
		Iterator iter=books.entrySet().iterator();
		while(iter.hasNext()) {
			Map.Entry entry=(Map.Entry)iter.next();
			System.out.println(entry.getKey()+" - "+((Books)entry.getValue()).getName()+" - "+((Books)entry.getValue()).getMoney()+" - "+((Books)entry.getValue()).getFrom());
		}
	}

}
class Books {
	private String number;
	private String name;
	private double money;
	private String from;
	public Books() {}
	public Books(String number,String name,double money,String from) {
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