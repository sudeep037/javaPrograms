package TYPrograns;

public class StringType1 {

public static void main(String[] args) {
		
		String str = "hi hello welcome";  // output --> "emoclew ot avaj dlrow"
		String [] arr =  str.split(" ");
		
		for(int i = 0; i<arr.length; i++)
		{
			reverseWords(arr[i]);
		}
	}
	
	public static void reverseWords(String words)
	{
		String s = "";
		for(int i = words.length()-1; i>=0; i--)
		{
			s = s + words.charAt(i);
		}
		System.out.print(s+" ");
	}
}
