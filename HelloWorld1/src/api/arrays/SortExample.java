//배열항목정렬
package api.arrays;

import java.util.Arrays;

public class SortExample {
	public static void main(String[] args) {
		// 기본타입,String배열을 Arrays.sort()메소드의
		// 매개값으로 지정시 자동으로 오름차순정렬

		// 숫자배열 정렬
		int[] scores = { 99, 97, 98 };
		Arrays.sort(scores);
		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "]" + scores[i]);
		}
		System.out.println();

		// 문자배열 정렬
		String[] names = { "홍길동", "박동수", "김민수" };
		Arrays.sort(names);
		for (int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "]" + names[i]);
		}
		System.out.println();

		// 사용자정의 클래스타입의 배열 정렬
		// _해당클래스에서 Comparable인터페이스 구현필요
		Member m1 = new Member("홍길동");
		Member m2 = new Member("박동수");
		Member m3 = new Member("김민수");
		Member[] members = { m1, m2, m3 };
		Arrays.sort(members);
		for (int i = 0; i < members.length; i++) {
			System.out.println("members[" + i + "]" + members[i].name);
		}

	}
}
