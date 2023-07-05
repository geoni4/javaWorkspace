package ex230704;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class BufferedCopier {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("대상 파일: ");
		
		String src = scanner.nextLine();
		
		System.out.print("사본 이름: ");
		String dst = scanner.nextLine();
		
		try(InputStream in = new FileInputStream(src);
				OutputStream out = new FileOutputStream(dst)){
			byte buf[] = new byte[1024];
			int len;
			while(true) {
				len = in.read(buf);
				if(len == -1)
					break;
				out.write(buf, 0, len);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
				
	}
}
