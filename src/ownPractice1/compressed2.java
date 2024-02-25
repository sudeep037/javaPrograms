package ownPractice1;

public class compressed2 {

	public static void main(String[] args) {
		
		String s = "aabbabc";
		String [] str = s.split("");
		
		for(int i = 0; i<str.length; i++)
		{
			int count = 1;
			
			for(int j = i+1; j<str.length; j++)
			{
				if(str[i].equalsIgnoreCase(str[j]))
				{
					count++;
					str[j]="";
				}
			}
			if(str[i]!="" && count>=1)
			{
				System.out.print(str[i]+count);
			}
		}
	}
}
