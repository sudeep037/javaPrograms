package ownPractice;

public class stringPrac {

	public static void main(String[] args) {
		
		String s = "i am Selenium";  // o/p->  mu i neleSmai
		String str = s.toLowerCase();
		String s1 = "";

		
		for(int i = str.length()-1; i>=0; i--)
		{
			s1 = s1 + str.charAt(i);
		}
		
		String s2 = s1.replaceAll(" ", "");
		
		for(int j = 0; j<=s2.length()-1; j++)
		{   
		   if(j==0)
		   {
			   System.out.print(s2.charAt(j)+" ");
		   }
		   else if(j>0 && j<3)
		   {
			   System.out.print(s2.charAt(j));
		   }
		   else if (j>=3)
		   {
			   System.out.print(" "+s2.charAt(j));
		   }
		}
		
		
		//System.out.println(s2.substring(0,1)+" "+s2.substring(1,3)+" "+s2.substring(3, 11));
		
	}
}
