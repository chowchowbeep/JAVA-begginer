package com.yedam.collections.tree;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Fruits {
	String name;
	int price;

	public Fruits(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
}

	class ComparatorClass implements Comparator<Fruits> {
		@Override
		public int compare(Fruits o1, Fruits o2) {
			if (o1.price > o2.price)
				return 1;
			else if (o1.price == o2.price)
				return 0;
			else
				return -1;
		}
	}
	

	public class ComparatorExample {
		public static void main(String[] args) {
			// TreeSet이 Comparator를 사용할 수 있도록
			// TreeSet 생성자의 매개값으로 제공
			TreeSet<Fruits> tSet = new TreeSet<>(new ComparatorClass());
			tSet.add(new Fruits("aaa", 30));
			tSet.add(new Fruits("bbbb", 25));
			tSet.add(new Fruits("cc", 35));
			tSet.add(new Fruits("dddd", 50));

			Iterator<Fruits> iter = tSet.iterator();
			while (iter.hasNext()) {
				Fruits p = iter.next();
				System.out.println(p.name + ", " + p.price);

			}

		}
	}
