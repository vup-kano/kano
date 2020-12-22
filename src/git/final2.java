package git;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class final2 {

	public static void main(String[] args) throws IOException{
		int byteread=0;
		DataInputStream in =null;
		DataOutputStream on =null;
		try {
			in=new DataInputStream(new FileInputStream("C:/Users/41938/Desktop/src.txt"));
	        on = new DataOutputStream(new FileOutputStream("C:/Users/41938/Desktop/dest.txt"));
	        byte[] buffer=new byte[1024];
	        while((byteread=in.read(buffer))!=-1) {
	        	System.out.println("正在加载中");
	        	on.write(buffer, 0, byteread);
	        	System.out.println("共"+byteread+"个byte");
	        	}
	        }
	        catch (FileNotFoundException ex) {
	        	System.out.println(ex.getMessage());
	        } 
			catch (IOException ex) {
				System.out.println(ex.getMessage());
	        } 
			finally {
	            try {
	                if (on != null)
	                    on.close();
	                if (in != null)
	                    in.close();
	            } 
	            catch (IOException ex) {
	            	System.out.println(ex.getMessage());
	            }
	            finally {
	            	System.out.println("运行结束");
	            }
			}
		}
	}