package com.yedam.lamda;
//표준 api의 함수적 인터페이스
//(메소드, 생성자의 매개타입으로 사용)
//(람다식을 대입할 수 있음)

public class RunnableExample {

	public static void main(String[] args) {
		//thread의 작업을 정의하는 runnable 인터페이스
		Runnable runnable = new Runnable() { // 익명구현객체
//			for(int i=0; i<10; i++) {
//				System.out.println(i);
//			}
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) { 
					System.out.println("a=> " + i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}
		};
		
		//매개값으로 인터페이스의 메소드를 오버라이드한 익명구현 객체 대입
		Thread thread = new Thread(runnable); 
		thread.start();//runnable의 메소드 실행
		
		//람다식이 매개값으로 대입되는 경우
		Thread thread2 = new Thread(() -> {
			//람다식을 매개값으로 하여 Thread인스턴스 생성
			for (int i = 0; i < 5; i++) {
				System.out.println("b=> " + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}

			}
		});
		thread2.start(); //{}내의 실행문을 실행

		
//		thread = new Thread(() -> { 
//			System.out.println("anonymous runnable run");
//		});
//		thread.start();
	}

}
