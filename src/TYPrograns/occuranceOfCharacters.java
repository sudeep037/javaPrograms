package TYPrograns;

public class occuranceOfCharacters {

	public static void main(String[] args) {
		
		String s = "Tester";
		String s1 = s.toLowerCase();
		
		char[] ch = s1.toCharArray();
		for(int i = 0; i<ch.length; i++)
		{
			int count = 1;
			for(int j = i+1; j<ch.length; j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					ch[j]=(char)-1;
				}
			}
			if(ch[i]!=(char)-1 && count>=1)
			{
				System.out.println(ch[i]+" ----> "+count);
			}
		}
	}
}
