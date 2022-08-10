/**
 * @author francode
 * @about this program checks if a string is palindrome  
 *        that is a string is equal to it's reverse an example bob.
 */
package string;

import java.util.Scanner;

public class StringPalindrome {
	private Scanner sc;
	private String astring;

	public StringPalindrome() {
		// TODO Auto-generated constructor stub
		System.out.println("Enter a String to check: ");
		sc = new Scanner(System.in);
		astring = sc.nextLine();
		if(isPalindrome(astring)) {
			System.out.println(astring +" is palindrome");
		}else {
			System.out.println(astring +" is Not palindrome");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StringPalindrome();

	}
	
	private boolean isPalindrome(String string) {
		
		//convert string into array of characters
		char[] chars = string.toCharArray();
		StringBuilder sb = new StringBuilder(string.length());
		
		//iterate through the array of characters from the last index
		for(int i = string.length()-1;i>=0;i--) {
		
		    //append charaxters from last index to first
			sb.append(chars[i]);
		}
		if(string.equals(sb.toString())) {
			return true;
		}else {
			return false;
		}
	}

}
