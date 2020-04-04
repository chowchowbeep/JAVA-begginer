package api.arrays;

import java.util.Arrays;

public class ArrayCopyExample { // 배열복사
	public static void main(String[] args) {
		char[] arr1 = { 'J', 'A', 'V', 'A' };

		// Arrays의 메소드는 static이므로 Arrays클래스로 바로사용가능

		// copyOf(원본배열,인덱스0부터 복사되는 길이(원본배열보다 큰 경우타겟 배열의 길이가 됨))
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr2)); //toString()

		// copyOfRange(원본배열,시작인덱스,끝인덱스)_끝인덱스전까지만 복사됨.
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
		System.out.println(Arrays.toString(arr3));
		
		// System.Arraycopy()
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		for(int i =0; i<arr4.length; i++) {
			System.out.println("arr4["+ i + "]="+ arr4[i]);
		}

	}

}
