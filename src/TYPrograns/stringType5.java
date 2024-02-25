package TYPrograns;

public class stringType5 {

	public static void main(String[] args) {
		
		String s = "Hi! He!llo Welc!ome !To";
		String [] str = s.split(" ");
		
		for(int i = 0; i<str.length; i++)
		{
		    reverseString(str[i]);
		}
	}
	
	public static void reverseString(String value)
	{
		String s = "";
		for(int i = value.length()-1; i>=0; i--)
		{
		   s = s + value.charAt(i);
		}
		System.out.print(s+" ");
	}
}
