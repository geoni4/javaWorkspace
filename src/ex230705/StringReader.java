package ex230705;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StringReader {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new FileReader("String.txt"))){
			String str;
			
			while(true) {
				str = br.readLine();
				if(str == null) break;
				System.out.println(str);
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
