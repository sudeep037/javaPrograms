package pattern1;

public class pat1 {

	public static void main(String[] args) {
		
		int rows = 4;
		int cols = 7;
		
		for(int i = 1; i<=rows; i++)
		{
			for(int k = i; k>=1; k--)
			{
				System.out.print(" ");
			}
			for(int j = 1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
