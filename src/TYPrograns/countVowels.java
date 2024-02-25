package TYPrograns;

import java.util.Scanner;

public class countVowels {

	public static void main(String[] args) {
		
		for(;;)
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string value");
		String str = sc.next();
		char[] ch = str.toCharArray();
		int count = 0;
		
		for(int i = 0; i<ch.length; i++)
		{
			
			if(ch[i]=='a'|| ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
			{
				count++;
			}
		}
		System.out.println("vowelCount ----> "+count);
		
		}
	}
}
