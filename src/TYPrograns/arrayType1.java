package TYPrograns;

public class arrayType1 {

	public static void main(String[] args) {
		
		int [] a = {4,5,7,3,2};
		int [] b = {2,3,4,1};   // o/p --> 6 8 11 4 2
		
		int length = a.length;
		
		if(a.length<b.length)
		{
			length = b.length;
		}
		
		for(int i = 0; i<length; i++)
		{
			try {
				System.out.print(a[i]+b[i]+" ");
			}
			catch(Exception e)
			{
				if(a.length<b.length)
				{
					System.out.print(b[i]+" ");
				}
				else {
					System.out.print(a[i]+" ");
				}
			}
		}
	}
}
