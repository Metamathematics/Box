package Generics;

import java.io.Serializable;

public class GMethods {
	public static void main(String[] args) {
		Object o = random("Stri", 2);
		Serializable s = random("Stri", 2);
		Comparable c = random("Stri", 2);
		System.out.println("" + o + " " + o.getClass());
		System.out.println("" + s + " " + s.getClass());
		System.out.println("" + c + " " + c.getClass());
	}

	public static <T> T random(T m, T n) {
		return Math.random() < 0.5 ? m : n;
	}
}
