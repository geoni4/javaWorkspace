import java.util.Arrays;

public class EnhancedFor {
	public static void main(String[] args) {
		int[] ar = {1, 2, 3, 4 ,5};
		for(int e : ar) {
			System.out.print(e + " ");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(ar));
		
		int sum = 0;
		
		for(int e : ar)
			sum +=e;
		System.out.println(sum);
		
	}
}
