package com.yedam.lamda;
//표준 API의 함수적 인터페이스
//Consumer_매개값o, 리턴값x (매개값을 소비만 함)

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {

	public static void main(String[] args) {
		// String타입의 매개값을 받는 Consumer인터페이스의 익명구현객체를 생성함
		// {} 안의 실행문은 accept라는 추상메소드를 재정의한 것(람다식으로 표현되어, override어노테이션 x)
		Consumer<String> consumer = (t) -> { 
			System.out.println(t + "8");
		};
		consumer.accept("java"); // 익명구현객체의 메소드 호둘

		BiConsumer<String, String> biConsumer = (t, u) -> {
			System.out.println(t + u);
		};
		biConsumer.accept("java", "8");

		DoubleConsumer dbConsumer = (d) -> { //매개값이 double타입으로 고정되어 있음.
			System.out.println("java" + d);
		};
		dbConsumer.accept(8);// 8.0으로 대입

		ObjIntConsumer<String> objConsumer = (t, o) -> { //객체(String타입)와 Int값을 매개변수로 함
			System.out.println(t + o);
		};
		objConsumer.accept("java", 8);

	}
}