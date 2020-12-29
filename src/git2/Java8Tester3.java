package git2;

public class Java8Tester3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int num=1;
		Converter<Integer,String >s=(param)->System.out.println(String.valueOf(param+num));
		s.convert(2);
	}

    public interface Converter<T1, T2> {
        void convert(int i);
    }
}
