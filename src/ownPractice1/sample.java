package ownPractice1;

public class sample {

	public static void main(String[] args) {
		
		String s = "Hi! He!llo Welc!ome !To";
		String s1 = s.replaceAll("[^A-Za-z]", "");
		System.out.println(s1);
		int a = s1.length()-1;
		
		for(int i = 1; i<s.length();  i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				System.out.print(s.charAt(a--));
			}
			else {
				System.out.print(s.charAt(i));
			}
		}
	}
}
