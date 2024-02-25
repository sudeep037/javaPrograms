package ownPractice1;

public class compressedString {

	public static void main(String[] args) {
		
		String s = "aabbcab";   // o/p --> a2b2c1a1b1
		
		String[] str = s.split("");
		//int count = 0;
		
		for(int i = 0; i<str.length; i++)
		{
			int count = 0;
			
			for(int j = i+1; j<str.length; j++)
			{
				if(str[i].equalsIgnoreCase(str[j]))
				{
					count++;
					str[j]="";
				}
			}
			if(count>=1 && str[i]!="")
			{
			  System.out.print(str[i]+count);
			}
		}
		
		 for(int i = 0; i<str.length; i++)
		{
		   int count1 = 1;
			
			for(int j = i+1; j<str.length; j++)
			{
				if(str[i].equalsIgnoreCase(str[j]))
				{
					count1++;
					str[j]="";
					break;
				}
			}
			if(count1>=1 && str[i]!="")
			{
			System.out.print(str[i]+count1);
			}
		} 
	}
}
