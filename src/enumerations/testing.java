package enumerations;

public class testing {
	public static void main(String[] args) {
		Object o = new Object();
		Object o2 = new Object();
		String s = "sdasdsa";
		int hcode = o.hashCode();
		int hcode2 = o2.hashCode();
		System.out.print(hcode + " " + hcode2);
	}
}
