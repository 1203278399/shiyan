import java.io.*;
public class ÎÄ¼þÁ÷ {
	public static void main(String[] args) throws Exception{
		FileInputStream in=new FileInputStream("src/test.txt");
		FileOutputStream out=new FileOutputStream("src/test2.txt");
		byte[] a = new byte[1024];
		while(in.read(a)!=-1){
			System.out.println(new String(a));
		}
		out.write(a);
	}
}
