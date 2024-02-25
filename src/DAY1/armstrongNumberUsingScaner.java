package DAY1;

import java.util.Scanner;

// Armstrong number using Scanner class

public class armstrongNumberUsingScaner {

	static int copy = 0;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int arrSize = sc.nextInt();
		int arr [] = new int [arrSize]; 
		int num = 0;
		for(int i = 0; i<arrSize; i++)
		{
			System.out.println("Enter the "+i+" array value");
			arr[i]=sc.nextInt();
		}
		
		for(int j = 0; j<arr.length; j++)
		{
		   palindrome(arr[j]);
	    }
	}
	
	public static void palindrome(int num)
	{
		int [] arr = {num};  int sum = 0;
		for(int i = 0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
			copy = arr[i];
			while(arr[i]!=0)
			{
				int r = arr[i]%10;
				sum = sum + (r*r*r);
				arr[i]=arr[i]/10;
			}
		 if(copy==sum)
		 {
			System.out.println(copy+" is an Armstrong number");
		 }
		 else {
			 System.out.println(copy+" is not an Armstrong number");
		 }
	   }
	}
	
	
}
