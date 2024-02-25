package ownPractice1;

import java.util.Scanner;

public class occuranceOfCharInString {

	public static void main(String[] args) {
		
		for(;;)
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string value");
		String s = sc.next();
		
		char[] ch = s.toCharArray();
		
		for(int i = 0; i<ch.length; i++)
		{
			int count = 1;
			
			for(int j = i+1; j<ch.length; j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					ch[j]=(char)-1;
				}
			}
			if(ch[i]!= (char)-1 && count>=1)
			{
				System.out.println(ch[i]+" ---> "+count);
			}
		}
		}
		
	}
}
