package TYPrograns;

import java.util.Scanner;

public class removeDuplicateVowelsFromString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string value");
		String str = sc.next();
		char[] ch = str.toCharArray();
		int count = 0;
		
		for(int i = 0; i<ch.length; i++)
		{
			//int count = 0;
			for(int j = i+1; j<ch.length; j++)
			{
				if(ch[j]=='a'||ch[j]=='e'||ch[j]=='i'||ch[j]=='o'||ch[j]=='u')
				{
					count++;
					break;
				}
			}
			
		}
	}
}
