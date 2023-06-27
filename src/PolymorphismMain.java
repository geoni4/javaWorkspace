
class AA{
	int aa;

	@Override
	public String toString() {
		return "AA [aa=" + aa + "]";
	}
}

class BB extends AA{
	
	int bb;

	@Override
	public String toString() {
		return "BB [bb=" + bb + "]";
	}
	
	
}


class Cake{
	public void yummy() {
		System.out.println("Yummy Cake");
	}
}

class CheeseCake extends Cake{

	@Override
	public void yummy() {
		System.out.println("Yummy Cheese Cake");
	}
	
}

class Robot{
	public void work() {
		
	}
}

class DanceRobot extends Robot{
	@Override
	public void work() {
		System.out.println("춤추는 로봇입니다.");
	}
}

class DrawRobot extends Robot{
	@Override
	public void work() {
		System.out.println("그림을 그리는 로봇입니다.");
	}
}

class WashRobot extends Robot{
	@Override
	public void work() {
		System.out.println("세탁하는 로봇입니다.");
	}
}



public class PolymorphismMain {
	public static void main(String[] args) {
//		AA aa = new AA();
//		System.out.println(aa);
//		
//		BB bb = new BB();
//		System.out.println(bb);
//		
//		aa = new BB();
//		System.out.println(aa);
		
//		Cake c1 = new CheeseCake();
//		CheeseCake c2 = new CheeseCake();
//		
//		c1.yummy();
//		c2.yummy();
		
		Robot[] arrRobot = {new DanceRobot(), new DrawRobot(), new WashRobot()};
		
		for(Robot r: arrRobot) {
			r.work();
		}
		
		
	}
}
