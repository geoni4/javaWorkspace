import java.util.Scanner;

public class ForInFor {
	public static void main(String[] args) {
		for(int i =1;i<10;i++) {
			if(i%2 == 1) continue;
			for(int j =1; j<10;j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			System.out.println();
		}
	}
}