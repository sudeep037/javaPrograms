package ownPractice;

public class patternPractice {

	public static void main(String[] args) {
		
		int n = 5;
		int m = 1;
		
		for(int i = 1; i<=n; i++)
		{
			for(int j = i; j<=n; j++)
			{
				System.out.print(m+1);
			}
			System.out.println();
		}
	}
}
