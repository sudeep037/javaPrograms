package DAY1;

import java.util.Scanner;

public class practice3 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your array size");
		int arrSize = sc.nextInt();
		String [] arr = new String [arrSize];
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println("Enter your string values here");
			arr[i]=sc.next();
			reverseString(arr[i]);
		}
	}
	
	public static void reverseString(String value)
	{
		String s1 = value; 
		String s2 = "";
		for(int i = s1.length()-1; i>=0; i--)
		{
			s2 = s2 + s1.charAt(i);
		}
		System.out.println(s1+" ----> "+s2);
	}
}
