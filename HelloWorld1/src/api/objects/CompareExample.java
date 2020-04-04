package api.objects;

import java.util.Comparator;
import java.util.Objects;

public class CompareExample {
	
	public static void main(String[] args) {
		Student s1 = new Student(1);
		Student s2 = new Student(1);
		Student s3 = new Student(2);

		int result = Objects.compare(s1, s2, new StudentComparator());
		System.out.println(result);
		
		result = Objects.compare(s1, s3, new StudentComparator());
		System.out.println(result);
	}
	
	static class Student { //중첩정적클래스
		int sno;
		Student(int sno) { 
			this.sno = sno;
		}
	}
	
	static class StudentComparator implements Comparator<Student>{
		// a가 b보다 작으면 음수, 같으면0 , 크면 양수를 리턴하도록 구현 클래스 생성
		@Override
		public int compare(Student a, Student b) {
//			if(a.sno<b.sno) return -1;
//			else if(a.sno == b.sno) return 0;
//			else return 1;
//		    아래의 코드로 대체 가능
			return Integer.compare(a.sno, b.sno);
			
		}
		
	}
}


