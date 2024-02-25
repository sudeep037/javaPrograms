package ownPractice;

public class stringAssgn1 {
 
	public static void main(String[] args) {
		
		String s = "aabcabd";  // output--> a2b2c1d1
		String[] arr = s.split("");
		for(int i = 1; i<arr.length; i++)
		{
			int charCount = 1;
			
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[i].equals(arr[j]))
				{
					charCount++;
					arr[j]="";
				}
			}
			if(arr[i]!="")
			{
				System.out.print(arr[i]+charCount);
			}
		}
	}
}
