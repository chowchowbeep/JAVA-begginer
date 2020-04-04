package hello;

public class Student {
	private int stnum;
	private String name;
	private int scoreKr;
	private int scoreEn;
	private int scoreMath;
	
	public Student() {}
	
	public Student(int stnum, String name, int scoreKr, int scoreEn, int scoreMath) {
		super();
		this.stnum = stnum;
		this.name = name;
		this.scoreKr = scoreKr;
		this.scoreEn = scoreEn;
		this.scoreMath = scoreMath;
		
		
	}

	public int getStnum() {
		return stnum;
	}

	public void setStnum(int stnum) {
		this.stnum = stnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScoreKr() {
		return scoreKr;
	}

	public void setScoreKr(int scoreKr) {
		this.scoreKr = scoreKr;
	}

	public int getScoreEn() {
		return scoreEn;
	}

	public void setScoreEn(int scoreEn) {
		this.scoreEn = scoreEn;
	}

	public int getScoreMath() {
		return scoreMath;
	}

	public void setScoreMath(int scoreMath) {
		this.scoreMath = scoreMath;
	}
	
	
	
	
	
}
