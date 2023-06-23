import java.util.Arrays;

public class LottoNumber {
	public static void main(String[] args) {

		int[] numArr = new int[6];
//		int number;
//		int length = 0;
//		int i = 0;
//		
//		
//		while (length < 6) {
//			// 난수를 받는다.(1~45)
//			number = (int) (Math.random() * 45 + 1);
//
//			//넣을 인덱스 length, 확인용 인덱스 i
//			//length가 1이상일 때 들어간다.
//			if (length != 0)
//				for (i = 0; i < length; i++)		//i를 가지고 length와 비교해서 난수와 array에 있는 값을 비교하는데 i는 배열이 인덱스0부터 length까지의 값을 확인한다.
//					if (numArr[i] == number)	//같은 값을 가지고 있으면 for문 빠져나간다.
//						break;
//			
//			// 기본적으로 length와 i는 0이므로 일단 넣는다.
//			if (i == length)
//				numArr[length++] = number;	// length
//			
//			System.out.println("length : " + length + ", i : " + i + ", number : " + number);
//
//		}
		
		for(int i =0;i<numArr.length; i++) {
			numArr[i] = (int) (Math.random() * 45 + 1);

			for (int j = 0; j < i; j++) {		
				if (numArr[i] == numArr[j]) {
					i--;
					break;
				}
			}

		}

		System.out.println(Arrays.toString(numArr));
		Arrays.sort(numArr);

		for (int j = 0; j < numArr.length; j++) {
			System.out.print(numArr[j]);
			if (j < numArr.length - 1)
				System.out.print(", ");
		}
		System.out.println();
	}
}
