package hello;

import java.util.Scanner;

public class Cal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요");
		int mon = sc.nextInt();
		showCal(mon);
		sc.close();
	}

	public static void showCal(int mon) {
		String[] week = { "Sun", "Mon", "Tue", "wed", "Thr", "Fri", "Sat" };
		int month = mon;
		int monthDay = getMonthday(month);//달의 날짜수
		int sDay = getStartday(month); //1일의 시작위치
		System.out.println("          <<" + mon + "월달>>");

		for (int i = 0; i < week.length; i++) {// 요일 타이틀 출력
			System.out.print(" " + week[i]);
		}
//		for(String str : week) {//요일 타이틀 출력
//			System.out.print(" "+str); 
//		}
		System.out.println();

		// 공란을 확보하여 1일의 위치 지정
		for (int i = 1; i < sDay; i++) { //1일 위치 전의 공간갯수만큼 반큼 공란 삽입을 반복함.
			System.out.printf("%4s", ""); // 하루의 날짜가 차지하는 공간이4기 때문에
		}
		for (int i = 1; i <= monthDay; i++) { // 날짜출력, 일주일지나면 줄바꿈
			System.out.printf("%4d", i);
			if ((sDay + i - 1) % 7 == 0) {
				System.out.println();
			}
		}

	}

	public static int getStartday(int month) {
		int startDay = 0;
		if (month == 9) {
			startDay = 1; // 일요일
		} else if (month == 10) {
			startDay = 3; // 화요일
		} else if (month == 11) {
			startDay = 6; // 금요일
		} else if (month == 8) {
			startDay = 5;
		}
		return startDay;
	}

	public static int getMonthday(int month) {
		int day = 0;
		if (month == 2) {
			day = 28;
		} else if (month <= 7 && month % 2 == 1) {// 
			day = 31;
		} else if (month >= 8 && month % 2 == 0) {
			day = 31;
		} else {
			day = 30;
		}
		return day;
	}

}
