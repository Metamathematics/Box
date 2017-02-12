package dsa3;
import java.util.ArrayList; import java.util.Scanner;

public class zad13 {
	public class Solution { 
		public void main(String[] args) throws Exception {

		@SuppressWarnings("resource")
		Scanner sc1 = new Scanner(System.in);
	    int a = sc1.nextInt();
	    int b = sc1.nextInt();
	    
	    ArrayList<Integer> listA = new ArrayList<Integer>();
	    ArrayList<Integer> listB = new ArrayList<Integer>();
	    
	    for (int i = 1; i <= a; i++) {
	        if (a % i == 0)
	            listA.add(i);
	    }
	    
	    for (int i = 1; i <= b; i++) {
	        if (b % i == 0)
	            listB.add(i);
	    }
	    for (int i = listA.size()-1; i >= 0; i--) {
	        if (listB.contains(listA.get(i))) {
	            System.out.println(listA.get(i));
	            break;
	        }
	    }
	}
}
}
