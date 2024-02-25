package ownPractice1;

public class practice3 {

	public static void main(String[] args) {
		
		String s = "abgt!reys&ijkwq!gsj";
		String str = "";
		
		for(int i = s.length()-1; i>=0; i--)
		{
			/*if(s.charAt(i)=='!' || s.charAt(i)=='&')
			{
				System.out.print(s.charAt(i));
			}*/
				str = str + s.charAt(i);
		}
		
		System.out.print(str);
	}
}
