
public class ScoreExample2 {
	public static void main(String[] args) {
		int kor = 90;
		int eng = 70;
		int math = 45;
		
		int total = kor + eng + math;
		double avg = total / 3.0;
		char grade = '가';
		
		if( avg>=90) {
			grade='수';
		} else if( avg>=80) {
			grade='우';
		} else if( avg>=70) {
			grade='미';
		} else if( avg>=60) {
			grade='양';
		} else {
			grade='가';
		}
		System.out.println("총점: " + total);
		System.out.println("평균: " + avg);
		System.out.println("성적: " + grade);
		
		
	}
}
