
public class ForExample {
	public static void main(String[] args) {
		
		int dan = 7;
		for( int i =1 ; i < 10 ; i++) {
			System.out.println(dan + " * " + i + " = " + dan * i);
		}
		
		/*
		 * for( int i = 1; i< 10; i++) {
		 * 
		 * for(int j = 1 ; j< 10; j++) { System.out.println(i + " * " + j + " = " + i *
		 * j); } System.out.println(); }
		 */
		
		
		for(int i =1; i<=1000;i++) {
			if( i % 11 == 0 && i % 7 == 0 ) {
				System.out.println("7의 배수이자 11의 배수인 첫번째 수 : " + i);
				break;
			}
		}
	}
}
