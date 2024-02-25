package TYPrograns;

// Count the occurance of numbers in an array 

public class findFrequentlyRepeatedNumber {

	public static void main(String[] args) {
	
	// Approach ---> 1
		
     	int arr [] = {4,5,6,5,7,9,5,6,4};
		for(int i = 0; i<arr.length; i++)
		{ 
			int count = 1;
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					count ++;
					arr[j]=-1;
				}
			}
			if(arr[i]!=-1)
			{
			System.out.println(arr[i]+" ---> "+count);
			} 
		}
	//	Approach ---> 2
		
	/*	int [] arr = {1,2,2,5,7,3,3,5};
		int max = 0; int val = 0;
		for(int i = 0; i<arr.length; i++)
		{
			int count = 0;
			for(int j = 0; j<arr.length; j++)
			{
				if(arr[j]==arr[i])
				{
					count++;
				}
			}
			if(count>max)
			{
				max = count;
				val = arr[i];
			}
		}
		System.out.println(val+"---->"+max);
	} */
		}			
}
