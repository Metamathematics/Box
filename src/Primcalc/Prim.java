package Primcalc;

public class Prim {
	public static void main(String[] args){
	
		int[] prim = {0,1,2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,89,97,};
		
		
		for (int i = 1; i<prim.length-1; ++i){
			for (int j = i+1; j<prim.length; ++j){
			System.out.println (prim[i]+prim[j]);
		}
			}
		}
}


