package exafter230720;


class Gugudan{
	//필드(변수)
	
	
	// 생성자
	public Gugudan() {
		
	}
	
	public Gugudan(int i) {
		
	}
	
	//메소드
	public void printGugu(int i) {
		for(int dan =1;dan<=i;dan++) {
			for(int j =1;j<10;j++) {
				System.out.println(dan + " x " + j + " = " + dan*j);
			}
		}
		
	}
	
	//클래스()
}


public class ClassExample {
	public static void main(String[] args) {
		Gugudan gugudan = new Gugudan();

		//Gugudan.Gdan = new Gugudan.Gdan();
		
		gugudan.printGugu(10); //1단부터 10단까지 출력
		gugudan.printGugu(20); //1단부터 20단까지 출력
	}
}
