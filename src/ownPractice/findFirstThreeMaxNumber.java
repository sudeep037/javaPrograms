package ownPractice;

public class findFirstThreeMaxNumber {

	public static void main(String[] args) {
		
		int [] arr = {1,5,3,0,9,89,10};
		int max1 = 0; int max2 = 0; int max3 = 0;
		
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					max1 = arr[i];
					max2 = arr[j];
				}
				else if(arr[i]<arr[j])
				{
					max3 = arr[i];
				}
			}
		}
		System.out.println(max1+" "+max2+" "+max3);
	}
}
