package TYPrograns;

public class IMP_allZerosOccursLast {

   
	
	public static void main(String[] args) {
		
		int arr [] = {0,5,0,0,4,9,7,6,0,2,0};
		int [] arr1 = new int [arr.length];
		int m = 0;
		int n = arr.length-1;
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i]!=0)
			{
				arr1[m]=arr[i];
				m++;
			}
			else {
				arr1[n]=arr[i];
				n--;
			}
		}
		for(int j = 0; j<arr1.length; j++)
		{
			System.out.print(arr1[j]+" ");
		}
	}	
}
