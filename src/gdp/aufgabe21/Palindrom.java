package gdp.aufgabe21;

public class Palindrom {
	
	public static void main(String[] args){
		
		System.out.print("Enter word: "); String pal = console.InputHelper.readString();
		//palTest();
		
		if ( isPalindrome (pal) ) System.out.print(pal + " is a palindrome.");
		else                      System.out.print(pal + " is not a palindrome.");
		
	}
	
	public static boolean isPalindrome (String word){
		if ( (word.length() == 0) || (word.length() == 1) ) return true;
		return isPalindrome (word.toLowerCase(), 0, word.length());
		
	}
	
	public static boolean isPalindrome(String word, int bI, int eI){
		if (bI >= eI) return true;
		if (word.charAt(bI) != word.charAt(eI-1))  return false;
		return isPalindrome(word,bI+1,eI-1);
	}
	
	public static void palTest (){
		System.out.println(isPalindrome("anna") == true);
		System.out.println(isPalindrome("Anna") == true);
		System.out.println(isPalindrome("papap") == true);
		System.out.println(isPalindrome("pApAP") == true);
		System.out.println(isPalindrome("C") == true);
		System.out.println(isPalindrome(" ") == true);
		System.out.println(isPalindrome("") == true);
		
		System.out.println(isPalindrome("anndsafdssijhsdiogpjhgfoaihgwoiröa") == false);
		System.out.println(isPalindrome("annt") == false);
		System.out.println(isPalindrome("papao") == false);
		
	}
	
}
