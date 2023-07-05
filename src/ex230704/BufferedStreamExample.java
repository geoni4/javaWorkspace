package ex230704;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class BufferedStreamExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int EOF = -1;
		String src, dst;
		System.out.print("대상 이름: ");
		src = scanner.nextLine();
		System.out.print("사본 이름: ");
		dst = scanner.nextLine();
		
		try(BufferedInputStream in = new BufferedInputStream(new FileInputStream(src));
				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dst))){
			int data;
			while(true) {
				data = in.read();
				if(data == EOF) break;
				
				out.write(data	);
			}
			System.out.println("카피 되었습니다.");
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
