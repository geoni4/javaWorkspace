import java.util.Scanner;

class RockScissorsPaper{
	private String[] counterPart = new String[] { "가위", "바위", "보"};
	private String myValue;
 
	
	
	public RockScissorsPaper() {
	}
	
	
	public String getCounterPart() {
		int num = (int) Math.random() * 3;
		return counterPart[num];
	}
	
	public String getMyValue() {
		return myValue;
	}


	public void setMyValue(String myValue) {
		this.myValue = myValue;
	}

	public String versus() {
		String counterPartValue = getCounterPart();
		if(myValue.equals(counterPartValue))
			return "비겼습니다";
		
	}
}

public class RSPMain {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		RockScissorsPaper rsp = new RockScissorsPaper();
		
		
		
	}
}
