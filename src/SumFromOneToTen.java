
public class SumFromOneToTen {
	public static void main(String[] args) {
		int sum = 0;
		int num = 1;
		while(num<=100) {
			sum += num;
			num++;
		}
		System.out.println("1부터 100까지의 합은? " + sum);
	}
}
