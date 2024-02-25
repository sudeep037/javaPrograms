package DAY1;

public class practice {

	public static void main(String[] args) {
		
		String s = "My name is Sudeep Dey";
		String s1 = ""; String s2 = "";
		String[] splitWords = s.split(" ");
		for(int i = 0; i<splitWords.length; i++)
		{
			//System.out.print(splitWords[i]+" ");
			if(i%2==0)
			{
				String upp = splitWords[i].toUpperCase();
				//System.out.print(upp+" ");  // MY IS DEY
			}
			else if(i%2==1)
			{
				s1 = splitWords[i];
				for(int j = s1.length()-1; j>=0; j--)
				{
					s2 = s2 + s1.charAt(j);
				}
				//System.out.print(s2+" ");
			}
		}
		System.out.print(s2+" ");
	}
}
