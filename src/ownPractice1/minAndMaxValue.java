package ownPractice1;

public class minAndMaxValue {

	public static void main(String[] args) {
		
		int [] arr = {23,67,90,543,12,67,20};
		int max = arr[1]; int min = arr[0];
		
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = 0; j<arr.length; j++)
			{
				if(arr[i]>=arr[j])
				{
					max = arr[i];
				}
				else {
					min = arr[i];
				}
			}
		}
		System.out.println(max+" "+min);
	}
}
