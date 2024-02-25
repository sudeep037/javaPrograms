package TYPrograns;

public class firstMinNumwithoutBubbleSort {

	public static void main(String[] args) {
		
		int [] arr = {6,5,8,2,9};
		int temp=0;
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])    // arr[i]<arr[j] (first max)
				{
					temp = arr[j];
					break;
				}
			}
		}
		System.out.println(temp);
	}
}
