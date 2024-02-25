package DAY1;

import java.util.Scanner;

public class strongNumberUsingScanner {

	static int copy = 0;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your array size");
		int arrSize = sc.nextInt();
		int arr [] = new int [arrSize];
		for(int i = 0; i<arrSize; i++)
		{
			System.out.println("Enter the "+i+" value");
			arr[i]= sc.nextInt();
		}
		for(int j = 0; j<arr.length; j++)
		{
			strongNumber(arr[j]);
		}
	}
	
	public static void strongNumber(int num)
	{
		int arr [] = {num};
		int sum = 0;
		for(int i = 0; i<arr.length; i++)
		{
			copy = arr[i];
			while(arr[i]!=0)
			{
				int r = arr[i]%10;
				sum = sum + factorial(r);
				arr[i]=arr[i]/10;
			}
			if(copy==sum)
			{
				System.out.println(copy+" is Strong Number");
			}
			else {
				System.out.println(copy+" is not a Strong Number");
			}
		}
	}
	
	public static int factorial(int num)
	{
		int fact = 1;
		for(int i = num; i>=1; i--)
		{
			fact = fact*i;
		}
		return fact;	
	}
}
