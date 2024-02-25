package ownPractice1;

import TYPrograns.stringPalindrome;

public class sample2 {

	public static void main(String[] args) {
		
		String s = "abcdaadx";
		
		for(int i = 0; i<s.length(); i++)
		{
			for(int j = i+1; j<s.length(); j++)
			{
				String s1 = s.substring(i,j);
				System.out.println(s1);
				
			    int subLength =  s1.length()-1;
			    
			    if(subLength==3)
			    {
			    	System.out.println(s1.substring(i, j));
			    	palindrome(s1);
			    }
			}
		}
		
	}
	
	public static void palindrome(String s1)
	{
		String copy = s1;     
		String s2 = "";
		
		for(int i = s1.length()-1; i>=0; i--)
		{
			s2 = s2 + s1.charAt(i);
		}
		
		if(copy.equalsIgnoreCase(s2))
		{
			System.out.println(copy+" ---> "+"palindrome");
		}
	}

	
}
