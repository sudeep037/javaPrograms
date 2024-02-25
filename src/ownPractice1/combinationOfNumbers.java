package ownPractice1;

public class combinationOfNumbers {

	public static void main(String[] args) {
		
		int [] arr = {7,4,3,8,2,5,9,6};
		int sum = 11;
		
		for(int i = 0; i<arr.length; i++)
		{
			int count = 0;
			
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[i]!=arr[j])
				{
					if((arr[i]+arr[j])==sum)
					{
						count++;
						System.out.println("Combinations - "+(arr[i]+","+arr[j])+" ---> "+count);
					}
				}
				else if(arr[i]==arr[j]){
					count = 0;
				}
			}
		}
	}
}
