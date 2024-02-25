package ownPractice;

public class stringRotation {

	public static void main(String[] args) {
		
		String str = "Hi Hello Welcome To";
		
		//     O/P= Hello Welcome To Hi
		//          Welcome To Hi Hello
		//          To Hi Hello Welcome
		//          Hi Hello Welcome To

		String[] sub = str.split("Hello", 15);
		
		for(int i = 0; i<=str.length()-1; i++)
		{
		  System.out.println(sub[i]+" ");
		}
	}
}
