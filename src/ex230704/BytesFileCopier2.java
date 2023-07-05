package ex230704;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class BytesFileCopier {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("대상 파일: ");
		
		String src = scanner.nextLine();
		
		System.out.print("사본 이름: ");
		String dst = scanner.nextLine();
		
		try(InputStream in = new FileInputStream(src); OutputStream out = new FileOutputStream(dst)){
			int data;
			while(true) {
				data = in.read();
				if(data == -1)
					break;
				out.write(data);;
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
				
		
	}
}
