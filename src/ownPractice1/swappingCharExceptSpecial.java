package ownPractice1;

public class swappingCharExceptSpecial {

	public static void main(String[] args) {
		
		String s = "test@#yantra%$solutions&^@pvt!!ltd";
		String s1 = s.replaceAll("[^0-9A-Za-z]", "");
		//System.out.println(s1);
		
		int a = s1.length()-1;
		
		for(int i = 0; i<s.length(); i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>=0 && s.charAt(i)<=9)
			{
				System.out.print(s.charAt(a--));
			}
			else {
				System.out.print(s.charAt(i));
			}
		}
	}
}
