package TYPrograns;

public class findFirstMinNumInArray {

	public static void main(String[] args) {
		
		int [] arr = {4,0,1,2};
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = i+1; j<arr.length; i++)
			{
				if(arr[i]>arr[j])
				{
					break;
				}
				System.out.println(arr[i]);
			}
		}
	}
}
