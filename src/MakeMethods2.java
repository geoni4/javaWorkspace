
public class MakeMethods2 {
	public static void main(String[] args) {
		
		 showStar(1);
		 showStar(2);
		 showStar(5);
	}
	
	public static void showStar(int n) {
		for(int i =0;i<n;i++) {
			for(int j =0;j<=i;j++) 
				System.out.print("*");
			System.out.println();
		}
	}
	
	
}
