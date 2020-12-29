package git2;


public class Java8Tester2 {
	
	final static String salutation="Hello! ";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreetingService greetingService1=message->
		System.out.println(salutation+message);
		greetingService1.sayMessage("Runnoob");
	}
	
	interface GreetingService {
		void sayMessage(String message);
	}
}
