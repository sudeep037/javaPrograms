package ownPractice;

public class stringAssg2 {

	public static void main(String[] args) {
		
		String s = "aabbabc";   // output --> a2b2a1b1c1
		String[] ch = s.split("");
		//int count = 0;
		//int count1 = 1;
		for(int i = 0; i<ch.length; i++)
		{
			int count = 0;
			
			for(int j = i+1; j<ch.length; j++)
			{
				if(ch[i].equalsIgnoreCase(ch[j]))
				{
					count++;
					ch[j]="";
				}
			}
			if(count>=1 && ch[i]!="")
			{
				System.out.print(ch[i]+count);
			}
		}
		
		for(int j = 0; j<ch.length; j++)
		{
			int count1 = 1;
			
			for(int z = j+1; z<ch.length; z++)
			{
				if(ch[j].equalsIgnoreCase(ch[z]))
				{
					count1++;
					ch[z]="";
					break;
				}
			}
			if(count1>=1 && ch[j]!="")
			{
				System.out.print(ch[j]+count1);
			}
		} 
	}
}
