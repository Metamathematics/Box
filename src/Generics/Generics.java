package Generics;

public class Generics<T> {

	T valuev;
	
	
	public Generics(T value) {
		super();
		this.valuev = value;
	}

	public static void main(String[] args) {
		print("2");
	}

	public static <T> void print(T variable) {
		System.out.print(variable);
	}

	public <T> void print() {
		System.out.print(valuev);
	}

	@Override
	public String toString() {
		return "Generics [valuev=" + valuev + "]";
	}
}
