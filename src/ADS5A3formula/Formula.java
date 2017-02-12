package ADS5A3formula;

public class Formula {
	
	public static void main (String[] args){
	
		int[] A = {44,12,23,88,71,11,94,39,20,5};
	
		for (int i = 0; i < A.length; ++i){
			System.out.print( " " + ( 3* A[i]+ 7 )% 16 );
		}
		
		System.out.println();
		
		for (int i = 0; i < A.length; ++i){
			System.out.print( " " + (7 - 2*(A[i] % 4)) );
		}
	
	}	
	
}
