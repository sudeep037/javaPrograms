package TYPrograns;

public class StringType2 {

	public static void main(String[] args) {
		
		String str = "hi hello welcome";   // output --> emoclew olleh ih
		String s = "";
		for(int i = str.length()-1; i>=0; i--)
		{
			s = s + str.charAt(i);
		}
		System.out.println(s);
		
	}
}
