package TYPrograns;

public class findSumofFirstThreeMinValue {

	// First sorting and then getting the sum
	
	public static void main(String[] args) {
		
		int [] arr = {4,5,6,7,5,7,2};
		for(int i = 0; i<arr.length; i++)
		{
			int count = 0;
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
		            int temp = arr[i];
		            arr[i]=arr[j];
		            arr[j]=temp;
				}
			}
		}
		int sum = 0;
		for(int i = 0; i<3; i++)
		{
			sum = sum+arr[i];
		}
		System.out.println(sum);
	}
}
