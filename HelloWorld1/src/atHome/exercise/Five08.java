package atHome.exercise;

public class Five08 {
	public static void main(String[] args) {
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		int sum = 0;
		double avg = 0.0;
		
//		for(int i=0; i<array.length; i++) {
//			for(int j=0; j<array[i].length; j++) {
//				sum = sum + array[i][j];
//			}
//		}
//		avg = sum/10.0;
		
		int count = 0;
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				sum = sum + array[i][j];
				count++; // 배열 속 전체 공간의 갯수를 셀 수 있음
			}
		}
		avg = (double)sum/count;
		
		
		System.out.println("sum: "+sum);
		System.out.println("avg: "+avg);
		
	}
}
