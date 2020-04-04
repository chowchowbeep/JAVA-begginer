package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null;//최고점수 받은 아이디
		int maxScore = 0;
		int totalScore = 0; 
		
		int num=0;
		
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			totalScore += value;
			num++;
			
			if(maxScore < value) {
				maxScore = value;
				name = key;
			}
		}
		System.out.println("평균점수 : "+(totalScore/num));
		System.out.println("최고점수 : "+(maxScore));
		System.out.println("최고점수를 받은 아이디 : "+name);
		
		
		
		

	}
}
