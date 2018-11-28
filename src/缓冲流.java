import java.io.*;
public class »º³åÁ÷ {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new FileReader("src/test.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("src/test2.txt"));
		String a=null;
		while((a=br.readLine())!=null){
			System.out.println(a);
			bw.write(a);
			bw.newLine();
		}
	}
}
