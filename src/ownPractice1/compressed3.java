package ownPractice1;

public class compressed3 {

	public static void main(String[] args) {
		
		String s = "aabbccddabcd";
		String[] str = s.split("");
		
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
			if(str[i]!="" && count>0)
			{
				System.out.print(str[i]+count);
			}
		}
		
		
		for(int k = 0; k<str.length; k++)
		{	
			int count1 = 1;
			for(int l = k+1; l<str.length; l++)
			{
				if(str[k].equalsIgnoreCase(str[l]))
				{
					count1++;
					str[l]="";
					break;
					//System.out.print(str[k]+count);
				}
			}
			if(str[k]!="" && count1>=1)
			{
				System.out.print(str[k]+count1);
			}
		}
	}
}
