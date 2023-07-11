package ex230711;

public class GoogleDocsExample4 {
	public static void main(String[] args) {
		for(int i = 1;i<1000000;i++) {
			if(i % 11 != 0)continue;
			if(i % 7 != 0)continue;
			System.out.println(i);
			break;
		}
	}
}
