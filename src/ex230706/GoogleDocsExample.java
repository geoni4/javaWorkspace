package ex230706;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class GoogleDocsExample {
	
	
	public GoogleDocsExample() {
		String code = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("웹 주소를 입력하세요.");
		
		String address = scanner.next();
		System.out.println(address);
		try {
			URL url = new URL(address);
			URLConnection con = url.openConnection();
			BufferedReader rd = new BufferedReader(new InputStreamReader(con.getInputStream()));
			FileWriter fw = new FileWriter("C:\\javalec\\workspace\\file.html", false);
			
			while(true) {
				code = rd.readLine();
				if(code == null) break;
				fw.write(code);
			}
			
			fw.close();
			rd.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}




	public static void main(String[] args) {
		new GoogleDocsExample();
	}
}
