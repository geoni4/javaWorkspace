import java.util.Scanner;

public class StringExample230623 {
	
	static boolean isVowel(char ch) {
		char lowerVowel = Character.toLowerCase(ch);
		switch(lowerVowel) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String str, menu;
		int length;
		int vowel, consonant;
		while(true){
			
			System.out.println("영어 단어를 입력하세요.");
			str = scanner.nextLine();
			length =0;
			length = str.length();
			vowel = 0;
			consonant = 0;
			
			System.out.println("총 글자 수는: " + length +"개 입니다.");
			
			for(int i=0;i<length; i++) {
				if(isVowel(str.charAt(i)))	vowel += 1;
				else 						consonant += 1;
			}
			
			System.out.println("모음은 : " + vowel + "개 입니다.");
			System.out.println("자음은 : " + consonant + "개 입니다.");
			
			System.out.print("계속하시겠습니까? (yes,y/no,n) : ");
			
			menu = scanner.nextLine();
			
			if("yes".compareToIgnoreCase(menu) == 0 || "y".compareToIgnoreCase(menu) == 0) {
				continue;
			} else {
				break;
			}
		}
		
		System.out.println("종료되었습니다.");
		
	}
}


/*



    ======================
    힌트) length 함수와 charAt 함수사용
    영어 단어를 입력하세요.
    dakjfivnlwe
    총 글자 수는: 11개 입니다.
    모음은 : 3개 입니다.
    자음은 : 8개 입니다.



 */