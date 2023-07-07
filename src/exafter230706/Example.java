package exafter230706;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		new WebURLEx();
	}
}


class WebURLEx{
	public WebURLEx() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("웹 주소를 입력하세요.");
		String address = scanner.nextLine();
		try {
			URL url = new URL(address);
			URLConnection con = url.openConnection();
			BufferedReader rd = new BufferedReader(new InputStreamReader(con.getInputStream()));
			FileWriter wt = new FileWriter("stream.html", false);
			
			String data =null;
			while(true) {
				data = rd.readLine();
				if(data == null) break;
				wt.write(data);
				System.out.println(data);
			}
			System.out.println("완료");
			wt.close();
			rd.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}

