package TYPrograns;

import java.util.Scanner;

public class stringPalindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		for(;;)
		{
		System.out.println("Enter your String values");
		String value = sc.next();
		String rev="";
		
		for(int i = value.length()-1; i>=0; i--)
		{
			rev = rev + value.charAt(i);
		}
		if(rev.equals(value))
		{
			System.out.println(value+" is "+"Palindrome");
		}
		else {
			System.out.println(value+" is "+"not palindrome");
		}
		}
	}
}
