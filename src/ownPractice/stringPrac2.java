package ownPractice;

public class stringPrac2 {

	public static void main(String[] args) {
		
		String s = "aabbabc";
		char[] ch = s.toCharArray();
		
		for(int i = 0; i<ch.length; i++)
		{
			int count = 1;
			
			for(int j = i+1; j<ch.length; j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					System.out.print(ch[i]+count);
				}
			}
		  //System.out.print(ch[i]+count);
		}
	}
}
