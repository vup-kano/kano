package git;
import java.util.Scanner; 
public class text1 {
	public static void main(String[] args){
        String s = "sad5as6d4as56d4as65dsad1as65d1";
        //把字符串里面的字母替换成*
        String regex = "[a-z]";
        String ss = "*";
        String result = s.replaceAll(regex,ss);
        System.out.println(result);
    }
	}


