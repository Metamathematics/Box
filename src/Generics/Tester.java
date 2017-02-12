package Generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Tester {

	public static void main(String[] args) {
		Generics<Integer> inte = new Generics<>(532);
		Integer five = 5;
		System.out.println(inte);

		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(6);
		list.add(7);
		System.out.println(list);
		List<Void> list2 = new LinkedList<>();
		System.out.println(list2);
		
	}
}
