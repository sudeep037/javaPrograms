package TYPrograns;

import java.util.Arrays;
import java.util.Scanner;

public class stringAnagram {

	public static void main(String[] args) {
		
		for(;;)
		{
			System.out.println("Enter your String value");
			Scanner sc = new Scanner(System.in);
			String s1 = sc.next();
			System.out.println("Enter your String value which supposed to be Anagram");
			Scanner sc1 = new Scanner(System.in);
			String s2 = sc1.next();
			char [] a1 = s1.toCharArray();
			char[] a2 = s2.toCharArray();
			
			Arrays.sort(a1);
			//System.out.println(a1);
			Arrays.sort(a2);
			//System.out.println(a2);
			
			if(Arrays.equals(a1, a2))
			{
				System.out.println("Its an Anagram");
			}
			else {
				System.out.println("Its not an Anagram");
			}
		}
	}
}
