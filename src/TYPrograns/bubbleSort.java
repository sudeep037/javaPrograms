package TYPrograns;

public class bubbleSort {

	public static void main(String[] args) {
		
		int arr [] = {4,0,1,2};
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[j-1]>arr[j])
				{
					int temp = arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
		for(int i = 0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
