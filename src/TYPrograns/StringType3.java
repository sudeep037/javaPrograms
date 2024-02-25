package TYPrograns;

public class StringType3 {

	public static void main(String[] args) {
		
		String str= "hi hello welcome";   // output --> welcome hello hi
		String[] arr = str.split(" ");
		
	 	for(int i = 0; i<arr.length; i++)
		{
			if(arr[i].equalsIgnoreCase("welcome") && arr[i].equalsIgnoreCase("hi"))
			{
				String temp = arr[2];
				arr[2]=arr[1];
				arr[1]=temp;
			}
			System.out.println(arr[i]+" ");
		} 
	 	
	}
}
