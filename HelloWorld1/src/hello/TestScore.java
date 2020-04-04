package hello;

import java.util.Scanner;

public class TestScore {
	static Scanner sc = new Scanner(System.in);
	static Student[] stAry = new Student[50];

	public static void main(String[] args) {

		boolean run = true;

		while (run) {
			System.out.println("===================================================");
			System.out.println("1.성적등록 2.전체목록 3.학생번호조회 4.전체통계 5.총점기준정렬 6.종료");
			System.out.println("===================================================");
			System.out.println("선택>");
			int num = sc.nextInt();
			sc.nextLine();
			if (num == 1) {
				insertScore();
			} else if (num == 2) {
				listAll();
			} else if (num == 3) {
				search();
			} else if (num == 4) {
				statistic();
			} else if (num == 5) {
				 sort();
				System.out.println("수정중");
			} else if (num == 6) {
				run = false;
			}
		}
	}

	public static void insertScore() {
		System.out.println("[성적등록]");
		System.out.println("학생번호를 입력하세요");
		int stnum = sc.nextInt();
		sc.nextLine();
		System.out.println("이름를 입력하세요");
		String name = sc.nextLine();
		System.out.println("국어점수를 입력하세요");
		int scoreKr = sc.nextInt();
		sc.nextLine();
		System.out.println("영어점수를 입력하세요");
		int scoreEn = sc.nextInt();
		sc.nextLine();
		System.out.println("수학점수를 입력하세요");
		int scoreMath = sc.nextInt();
		sc.nextLine();

		Student student = new Student(stnum, name, scoreKr, scoreEn, scoreMath);

		for (int i = 0; i < stAry.length; i++) {
			if (stAry[i] == null) {
				stAry[i] = student;
				break;
			}
		}
	}

	public static void listAll() {
		System.out.println("[전체목록]");
		for (Student st : stAry) {
			if (st != null) {
				System.out.println("학생번호: " + st.getStnum() + " | 학생이름 : " + st.getName() + " | 국어점수 : "
						+ st.getScoreKr() + " | 영어점수 : " + st.getScoreEn() + " | 수학점수 : " + st.getScoreMath());
			}
		}
	}

	public static void search() {
		System.out.println("[학생번호조회]");
		int stnum = sc.nextInt();
		for (int i = 0; i < stAry.length; i++) {
			if (stAry[i] != null) {
				if (stAry[i].getStnum() == stnum) {
					int sum = stAry[i].getScoreKr() + stAry[i].getScoreEn() + stAry[i].getScoreMath();
					int avg = sum / 3;
					System.out.println("학생번호: " + stAry[i].getStnum() + " | 학생이름 : " + stAry[i].getName() + " | 국어점수 : "
							+ stAry[i].getScoreKr() + " | 영어점수 : " + stAry[i].getScoreEn() + " | 수학점수 : "
							+ stAry[i].getScoreMath() + " | 총점 : " + sum + " | 평균 : " + avg);
				}
			}
		}
	}

	

	public static void statistic() {
		System.out.println("[전체통계]");

		int stCount = 0;
		int krSum = 0;
		int enSum = 0;
		int mthSum = 0;
		for (int i = 0; i < stAry.length; i++) {
			if (stAry[i] != null) {
				stCount++;
				krSum = krSum + stAry[i].getScoreKr();
				enSum = enSum + stAry[i].getScoreEn();
				mthSum = mthSum + stAry[i].getScoreMath();
			}
		}

		int stSum = krSum + enSum + mthSum;
		int stAvg = (stSum / 3) / stCount;
		System.out.println("[반 전체 총점] " + stSum);
		System.out.println("[반 전체 평균] " + stAvg);

	}
	public static void sort() {
		
	}
	
}
