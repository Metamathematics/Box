package mathAlgorithms;

public class Factorial {
	public static void main(String[] args){
		for (int N = 1; N < 125; ++N){
			System.out.println(N + " " + factorialIterative(factorialInverse(N)) + " " + factorialInverseDouble(N));
			
		}
		//System.out.println(factorialInverse(7));
	}
	
	public static int factorialRekursive (int n){
		if (n < 1) { System.out.println("Illegal number");return 0;}
		return n == 1? 1 : n * factorialRekursive(n-1);
	}
	
	public static int factorialIterative (int n){
		if (n < 1) {System.out.println("Illegal number");return 0;}
		
		int fact = 1;
		while (n != 1){
			fact *= n;--n;
		}
		return fact;
	}
	
	public static int factorialInverse(long N){
		if (N < 1) {System.out.println("Illegal number");return 0;}
		
		long n = 1;
		int i = 1;
		while  (n <= N) {n *= n+1;++i;}
		return i-1;
	}
	
	public static double factorialInverseDouble(long N){
		if (N < 1) {System.out.println("Illegal number");return 0;}
		
		int n = factorialInverse(N);
		long N2 = factorialIterative(n+1);
		if ( N2/(n+1) == N) return n;
		else return n + (double)N/N2;
	}
}
