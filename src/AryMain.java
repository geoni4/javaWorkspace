import java.util.Arrays;

public class AryMain {
	public static void main(String[] args) {
		int[] ar = {1, 2, 3, 4, 5, 6, 7};
		int sum = sumOfAry(ar);
		System.out.println(sum);
		
		int[] ar2 = makeNewIntAry();
		System.out.println(Arrays.toString(ar2));
		
		int[] ar3 = new int[7];
		System.out.println(Arrays.toString(ar3));
		
	}
	
	static int sumOfAry(int[] ar) {
		int sum = 0;
		for(int i =0; i<ar.length;i++) {
			sum += ar[i];
		}
		return sum;
	}
	
	static int[] makeNewIntAry() {
		int[] ar = {1, 2, 3, 4, 5, 6, 7};
		return ar;
	}
	
}
