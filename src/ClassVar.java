
class AccessWay{
	static int num =0;
	
	AccessWay(){
		num++;
	}
}

class InstCnt{
	static int instNum = 0;
	
	InstCnt(){
		instNum++;
		System.out.println("인스턴스 생성: " + instNum);
	}
}

public class ClassVar {
	public static void main(String[] args) {
		InstCnt cnt1 = new InstCnt();
		InstCnt cnt2 = new InstCnt();
		InstCnt cnt3 = new InstCnt();
		
		
		AccessWay.num++;
		System.out.println(++AccessWay.num);
		
	}
	
}
