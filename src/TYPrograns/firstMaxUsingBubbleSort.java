package TYPrograns;

import java.util.Arrays;

public class firstMaxUsingBubbleSort {

	public static void main(String[] args) {
		
		int [] arr = {7,9,0,1,3,4};
		
		Arrays.sort(arr);
		
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
