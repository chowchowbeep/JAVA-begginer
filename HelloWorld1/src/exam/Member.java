package exam;

public class Member {
	int num;
	String name;
	String course;
	
	public Member() {
		super();
	}

	public Member(int num, String name, String course) {
		super();
		this.num = num;
		this.name = name;
		this.course = course;
	}

	public int getNum() {
		return num;
	}

	public String getName() {
		return name;
	}

	public String getCourse() {
		return course;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	


	
}
