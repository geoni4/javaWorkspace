package ex230706;

import java.net.InetAddress;
import java.util.Scanner;

public class InetAddressEx {
	Scanner scanner;

	public InetAddressEx() {
		System.out.println("Host 이름을 입력하세요.");
		
		scanner = new Scanner(System.in);
		
		try {
			InetAddress inetAddress = InetAddress.getByName(scanner.next());
			
			System.out.println("Computer NAME : " + inetAddress.getHostName());
			System.out.println("Computer IP : " + inetAddress.getHostAddress());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		new InetAddressEx();
	}
}
