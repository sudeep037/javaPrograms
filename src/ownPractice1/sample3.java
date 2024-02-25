package ownPractice1;

public class sample3 {

	public static void main(String[] args) {
		
		int space = 5;
		//int no = 1;
		
		for(int i = 1; i<=5; i++)
		{
			int no = 1;
			for(int j = 1; j<=i; j++)
			{
				System.out.print(no+" ");
				no++;
			}
			for(int k = 1; k<=space; k++)
			{
				System.out.print(" ");
			}
			space--;
			System.out.println();
		}
	}
}
