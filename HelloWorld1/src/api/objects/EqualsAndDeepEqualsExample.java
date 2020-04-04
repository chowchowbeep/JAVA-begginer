package api.objects;

import java.util.Arrays;
import java.util.Objects;

public class EqualsAndDeepEqualsExample {
	public static void main(String[] args) {
		Integer o1 = 1000;
		Integer o2 = 1000;
		System.out.println(Objects.equals(o1, o2)); //저장된 값비교_동일
		System.out.println(Objects.equals(o1, null));
		System.out.println(Objects.equals(null, o2));
		System.out.println(Objects.equals(null, null));//null과null은 true
		System.out.println(Objects.deepEquals(o1, o2)+"\n");
		
		Integer[] arr1 = {1,2};
		Integer[] arr2 = {1,2};
		System.out.println(Objects.equals(arr1, arr2));//저장된 값(번지)비교_다름
		System.out.println(Objects.deepEquals(arr1, arr2));//다른배열이지만 항목값은동일하므로True
		System.out.println(Arrays.deepEquals(arr1, arr2));//위와동일한결과
		System.out.println(Objects.deepEquals(null, arr2));
		System.out.println(Objects.deepEquals(arr1, null));
		System.out.println(Objects.deepEquals(null, null));//null과null은 true

		
	}

}
