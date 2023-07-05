
public class SumOfEvenNum{
 	public static void main (String[] args){
		for(int n = 1; n < 10; n++) {
			if(n % 2 == 0) continue;
			for(int i = 1; i < 10; i++) {
				if(i % 2 == 0) continue;
				System.out.println(n + " * " + i + " = " + n * i);
			}
			System.out.println();
		}
	}
}