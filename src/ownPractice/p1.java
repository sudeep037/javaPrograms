package ownPractice;

public class p1 {

	// common values in two arrays
	
	public static void main(String[] args) {
		
		int [] arr = {2,4,7,6,23,87};
		int[] arr1 = {6,87,0,90,23,45};
		int count = 0;
		
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = 0; j<arr1.length; j++)
			{
				if(arr[i]==arr1[j])
				{
					count++;
				}
			}
			System.out.println(arr[i]+" ----> "+count);
		}
	}
}
