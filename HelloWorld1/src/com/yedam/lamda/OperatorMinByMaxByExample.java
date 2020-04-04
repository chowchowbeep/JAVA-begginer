package com.yedam.lamda;

import java.util.Comparator;
import java.util.function.BinaryOperator;

class Fruit {
	String name;
	int price;

	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
}

public class OperatorMinByMaxByExample {
	public static void main(String[] args) {
		BinaryOperator<Fruit> bo;
		Fruit fruit;
		
		Comparator<Fruit> com = new Comparator<Fruit>() {
			
			//크기비교 불가능한 fruit인스턴스를 price필드값기준으로 비교가능하도록
			//Comparator의 compare메소드 재정의
			@Override
			public int compare(Fruit o1, Fruit o2) { 
				int result = 0;
				if (o1.price > o2.price)
					result = 1;
				else if (o1.price == o2.price)
					result = 0;
				else
					result = -1;
				return result;
			}
		};

		Comparator<Fruit> com2 = (o1, o2) ->  {
				int result = 0;
				if (o1.price > o2.price)
					result = 1;
				else if (o1.price == o2.price)
					result = 0;
				else
					result = -1;
				return result;
		};

		bo = BinaryOperator.maxBy(com);
		bo = BinaryOperator.minBy(com); 
		//매개값인 Compartor를 이용해서 BinaryOperator연산결과를 리턴하는 maxBy, minBy메소드 
		fruit = bo.apply(new Fruit("apple",1000), new Fruit("banana",2000));
		System.out.println(fruit.name+", "+fruit.price);
	}
}
