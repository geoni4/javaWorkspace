package ex230704;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class TextReader {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("읽을 파일: ");
		String src = scanner.nextLine();
		
		try(Reader in = new FileReader(src)){
			int ch;
			
			while(true) {
				ch = in.read();
				if(ch == -1) {
					break;
				}
				System.out.print((char)ch);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
