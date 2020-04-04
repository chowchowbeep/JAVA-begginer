package api.arrays;


//배열항목정렬_ SortExample참조
//Comparable 구현 클래스
public class Member implements Comparable<Member> {
	String name;
	Member(String name){
		this.name = name;
	}
	
	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.name);
	}
	

}
