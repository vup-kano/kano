package git2;
import java.util.ArrayList;
import java.util.List;
public class Exception10 {
	 static class OOMObject{
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<OOMObject> list = new ArrayList<OOMObject>();
		try{
			while(true){
				list.add(new OOMObject());
			}
	      }
	    catch (OutOfMemoryError ex){
	    	System.out.print("It is wrong!");	
	    	System.exit(0);
	      }
	    }
}


