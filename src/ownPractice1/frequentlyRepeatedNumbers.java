package ownPractice1;

public class frequentlyRepeatedNumbers {

	public static void main(String[] args) {
		
	   int [] arr = {1,2,5,1,7,2,1,9,8,9,2,7};
	   
	   for(int i = 0; i<arr.length; i++)
	   {
		   int count = 1;
		   
		   for(int j = i+1; j<arr.length; j++)
		   {
			   if(arr[i]==arr[j])
			   {
				   count++;
			   }
		   }
		   if(count>1)
		   {
			   System.out.println("Frequently repeated numbers are - "+arr[i]+" ---> "+count);
		   }
	   }
	}
}
