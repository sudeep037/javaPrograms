package ownPractice;

import java.util.Scanner;

public class removeDuplicatesFromString {

	public static void main(String[] args) {
		
		for(;;)
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String value");
		String str = sc.next();
		String str1 = "";
		char[] ch = str.toCharArray();
		
		for(int i = 0; i<ch.length; i++)
		{
			int count = 1;
			for(int j = i+1; j<ch.length; j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					ch[j]=(char) -1;
				}
			}
			if(count>1)
			{
				str1 = str1 + str.charAt(i);
			}
		}
		    System.out.println(str1);
	    }
	}
}
