package hello;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarExample { //
	public static void main(String[] args) {
//		Calendar cal = Calendar.getInstance();
//		cal.set(1991, 7, 8); // cal인스턴스의 set메소드의 매개값을 1991(년),7(월),8(일)로 지정
//		System.out.println("년: "+cal.get(Calendar.YEAR)); //해당 date의 연도 필드를 가져옴
//		System.out.println("월: "+cal.get(Calendar.MONTH)); //해당 date의 월
//		System.out.println("요일"+cal.get(Calendar.DAY_OF_WEEK)); //해당 date의 요일
//		System.out.println("일"+cal.get(Calendar.DAY_OF_MONTH)); //해당 date의 일
//		System.out.println("전체일수: "+cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		//해당 date의 월의 총 날짜수
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("년도를 입력하세요");
		int yyyy = sc.nextInt();
		System.out.println("월을 입력하세요");
		int mm = sc.nextInt();
		sc.close();
		getCal(yyyy, mm); // 입력받은 년, 월의 달력 출력하는 메소드 호출
		
//		cal.set(2019, 0, 1);//2019년 1월(0부터 시작) 1일
		
		
	}
	
	public static void getCal(int year, int month) {
		Calendar cal = Calendar.getInstance();
		//클래스명 변수명 = 클래스명.getInstance(); //Calendar 클래스의 인스턴스 생성 
		//캘린더클래스가 가지고 있는 메소드 사용 //SingletonExample참고
		int translatedMonth  = month -1; 
		//Calendar.getInstance()의 월은 0부터 시작하기때문에, 우리가 입력하는 월의 값에서 환산필요
		cal.set(year, translatedMonth, 8);
		//cal인스턴스의 set메소드의 매개값을 year년 month월 8일(일자는 임의의 값입력.)로 지정
		String[] week = { "Sun", "Mon", "Tue", "wed", "Thr", "Fri", "Sat" };
		int monthDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH); //달의 총 날짜 수
		int sDay = cal.get(Calendar.DAY_OF_WEEK); //1일의 시작요일(일~토->1~7)
		
		System.out.println("         <<" +year+"년 "+ month + "월>>"); //연월 타이틀
		for (int i = 0; i < week.length; i++) {// 요일 타이틀
			System.out.print(" " + week[i]);
		}
		System.out.println();
		

		// 공란을 확보하여 1일의 위치 지정
		for (int i = 1; i < sDay; i++) { //1일 위치 전의 공간갯수만큼 반큼 공란 삽입을 반복함.
			//1일의 시작일이 화요일이라면 sDay의 값은 3이고, for문에 의해 총 2번 루핑하여 비어있는 날 2일 삽입. 
			System.out.printf("%4s", ""); // 하루의 날짜가 차지하는 공간이4기 때문에
		}
		
		// 전체날짜출력 (일주일지나면 줄바꿈)
		for (int i = 1; i <= monthDay; i++) { //
			System.out.printf("%4d", i);
			if (((sDay-1) + i) % 7 == 0) { 
			// 시작요일숫자-1=>공란의 수. 
			// 공란수+특정일을 7로 나누어 떨어지는 경우 줄바꿈.
			// 1일이 일요일부터 시작한다면 7로 나누어떨어지는 날에 줄바꿈을 하면되지만,
			// 공란확보를 했기때문에 해당 날짜만큼 밀려서 줄바꿈을 할 수 있도록 공란만큼의 날짜를 더해서 7로 나눔.
				System.out.println();
			}
		}
		
		
		
	}
	
	

}
