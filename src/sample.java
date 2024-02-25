
public class sample {

	public static void main(String[] args) {
		
		String s = "abadaadx";
		//System.out.println(s.substring(0, 3));
		
		for(int i = 0; i<s.length(); i++)
		{
			for(int j = i+1; j<s.length(); j++)
			{
			 //System.out.println(s.substring(i, j));
	
			 String s1 = s.substring(i, j);
			 
			 int subLength = s1.length();
			 
			 if(subLength==3)
			 {
				 System.out.println(s1.substring(i, j));
			 }
			 
			}
		}
	}
}
