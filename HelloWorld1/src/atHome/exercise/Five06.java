package atHome.exercise;

public class Five06 {
	public static void main(String[] args) {
		
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		System.out.println(array.length+","+array[2].length);
		
		// 결과 3,5 
		//array.length는 전체 행의 길이, array[2].length는 3번째 행(0,1,2)의 열의 길이
	}
}
