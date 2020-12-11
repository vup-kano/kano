package git2;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Scanner;
public class studentInclude {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Set<Student> S = new TreeSet<Student>();
		Student s1=new Student(input.next(),input.next(),input.nextInt());
		Student s2=new Student("002","权儿",3);
		Student s3=new Student("003","他们的爸爸",20);
		S.add(s1);
		S.add(s2);
		S.add(s3);
		Iterator iter = S.iterator();
		while(iter.hasNext()) {
			Student s=(Student)iter.next();
			System.out.println(s.getID()+"  "+s.getName()+"  "+s.getAge());
		}
		}
}
class Student implements Comparable{
	private String ID;
	private String name;
	private int age;
	public Student() {}
	public Student(String ID,String name,int age) {
		this.ID = ID;
		this.name = name;
		this.age = age;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		this.ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int compareTo(Object o) {
	      if (!(o instanceof Student))
	        throw new RuntimeException("不是Student对象");
	      Student p = (Student) o;
	      if (this.age > p.age)
	        return 1;
	      if (this.age == p.age){
	        return this.name.compareTo(p.name);
	      }
	      return -1;
	}
}