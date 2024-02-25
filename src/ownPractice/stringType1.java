package ownPractice;

public class stringType1 {

	public static void main(String[] args) {
		
		String str = "hi this is the java world";
		int wordsCount = 1;
		
		for(int i = 0; i<=str.length()-1; i++)
		{
			if(str.charAt(i)==' ')
			{
				wordsCount++;
			}
		}
		System.out.println("words count"+" --> "+wordsCount);
		
		// Count number of vowels
		
		int vowelCount = 0;
		
		for(int i = 0; i<=str.length()-1; i++)
		{
			if(str.charAt(i)=='a'|| str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
			{
				vowelCount++;
			}
		}
		System.out.println("vowels count"+" --> "+vowelCount);
	}
}
