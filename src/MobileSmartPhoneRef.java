
class MobilePhone{
	protected String number;

	public MobilePhone(String number) {
		this.number = number;
	}
	
	public void answer() {
		System.out.println("Hi~ from "+ number);
	}
}


class SmartPhone extends MobilePhone{
	private String androidVer;

	public SmartPhone(String num, String androidVer) {
		super(num);
		this.androidVer = androidVer;
	}
	
	public void playApp() {
		System.out.println("App is running in " + androidVer);
	}
	
}


public class MobileSmartPhoneRef {
	public static void main(String[] args) {
		SmartPhone ph1 = new SmartPhone("010-555-777","Nougat");
		MobilePhone ph2 = new SmartPhone("010-999-333","Nougat");
		
		ph1.answer();
		ph1.playApp();
		
		ph2.answer();
		//ph2.playApp();
		
	}
}
