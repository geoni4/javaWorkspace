package ex230704;

import java.util.HashMap;

public class HashMapCollection {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();

		// k-v 기반 데이터 저장
		map.put(45, "Brown");
		map.put(37, "James");
		map.put(23, "Martin");

		// 데이터 탐색
		int n = 23;
		System.out.println(n + "번: " + map.get(n));
		n = 37;
		System.out.println(n + "번: " + map.get(n));
		n = 45;
		System.out.println(n + "번: " + map.get(n));

		// 데이터 삭제
		map.remove(37);

		// 데이터 삭제 확인
		n = 37;
		System.out.println(n + "번: " + map.get(n));

	}
}
