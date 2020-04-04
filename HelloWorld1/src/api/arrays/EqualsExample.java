package api.arrays;

import java.util.Arrays;

public class EqualsExample { // (중첩)배열의 항목비교
	public static void main(String[] args) { 
		int[][] original = { { 1, 2 }, { 3, 4 } };



		// 얕은 복사 후 비교_ 복사된 배열은 원본 배열이 참조하는 객체를 참조함
		System.out.println("[얕은 복사 후 비교]");
		int[][] cloned1 = Arrays.copyOf(original, original.length);
		System.out.println("배열번지 비교 : " + original.equals(cloned1));
		System.out.println("1차 배열 항목값 비교: " + Arrays.equals(original, cloned1));
		//배열에 저장된 값({1,2},{3,4} 각각의 주소값)을 비교_동일
		System.out.println("중첩 배열 항목값 비교: " + Arrays.deepEquals(original, cloned1));



		// 깊은 복사 후 비교_ 복사된 배열은 새로운 객체를 참조함
		System.out.println("\n[깊은 복제후 비교]");
		int[][] cloned2 = Arrays.copyOf(original, original.length);
		cloned2[0] = Arrays.copyOf(original[0], original[0].length);
		cloned2[1] = Arrays.copyOf(original[1], original[1].length);
		System.out.println("배열번지 비교 : " + original.equals(cloned2));
		System.out.println("1차 배열 항목값 비교: " + Arrays.equals(original, cloned2));
		System.out.println("중첩 배열 항목값 비교: " + Arrays.deepEquals(original, cloned2));


	}
}
