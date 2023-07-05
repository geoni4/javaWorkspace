package ex230705;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GoogleDocsExample {
	public static void main(String[] args) {
		String ks = "공부에 있어서 돈이 꼭 필요한 것은 아니다.";
	    String es = "Life is long if you know how to use it.";
		try(BufferedWriter wr = new BufferedWriter(new FileWriter("string.txt"))){
			wr.write(ks,0,ks.length());
			
			wr.newLine();
			wr.write(es, 0, es.length());
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		try(BufferedReader rd = new BufferedReader(new FileReader("string.txt"))){
			String str;
			while(true) {
				str = rd.readLine();
				if(str == null) break;
				System.out.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
