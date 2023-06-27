


interface ICalculator{
	public int add(int num1, int num2);
	public int sub(int num1, int num2);
	public double mult(int num1, int num2);
	public double divd(int num1, int num2);
}

class Calculator implements ICalculator{
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int sub(int num1, int num2) {
		return num1 - num2;
	}

	@Override
	public double mult(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}

	@Override
	public double divd(int num1, int num2) {
		if(num2 == 0) {
			System.out.println(num2+"는 0일 수 없습니다. 기본 값 1");
			num2 = 1;
		}
		return (double)num1 / num2;
	}
}


public class CalculatorMain {
	public static void main(String[] args) {
		ICalculator calc = new Calculator();
		
		System.out.println(calc.add(10, 20));
		System.out.println(calc.sub(20, 30));
		System.out.println(calc.mult(50, 11));
		System.out.println(calc.divd(10, 0));
		System.out.println(calc.divd(50, 15));
		
	}
}
