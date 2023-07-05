package ex230704;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class SimpleWriter {
	public static void main(String[] args) {
		try (Writer out = new FileWriter("data1.txt")){
			for(char ch ='A';ch<='Z'; ch++)
			out.write(ch);
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
