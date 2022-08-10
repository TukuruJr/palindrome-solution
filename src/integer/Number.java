package integer;

import java.util.Scanner;

public class Number {
	private Scanner sc;
	private int number;

	public Number() {
		// TODO Auto-generated constructor stub
		System.out.println("Enter a Number to check: ");
		sc = new Scanner(System.in);
		number = sc.nextInt();
		if(isPalindrome(number)) {
			System.out.println(number +" is palindrome");
		}else {
			System.out.println(number +" is Not palindrome");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      new Number();
	}
	

	private boolean isPalindrome(int num) {
		int pal = num;  //store the number in variable pal
		int reverse = 0;
		while(pal!=0) { //positive number and not zero
			int reminder = pal%10;
			reverse = (reverse*10)+reminder;
			pal = pal/10;
		}
		if(num==reverse) {
			return true;
		}else {
			return false;
		}
	}


}
