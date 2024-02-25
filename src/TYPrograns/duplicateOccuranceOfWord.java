package TYPrograns;

public class duplicateOccuranceOfWord {

	public static void main(String[] args) {
		
		String s = "Hi Hello Hi Hello Welcome";
		String[] str = s.split(" ");
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
		if(str[i]!="")
		{
			if(count>=1) // duplicates    // count==1 (unique)    // count>=1 (gives occurance of all string)
			{
			System.out.println(str[i]+" ---> "+count);
			}
		}
		}
	}
}
