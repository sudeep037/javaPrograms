package DAY1;

import java.util.Scanner;

public class Practice2 {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your array size");
		int arrSize = sc.nextInt();
		String [] arr = new String [arrSize];//5
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println("Enter your "+i+" string value");
			arr[i]=sc.next();
		   readCommonCharacter(arr[i]);
		}
	}
	
	public static void readCommonCharacter(String name)
	{
		String s = name;
		System.out.println(s);
		char[] ch = s.toCharArray();
		for(int i = 0; i<ch.length; i++)
		{
			int count=1;
			for(int j = i+1; j<ch.length; j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					ch[j]=(char) -1;
				}
			}
			if(ch[i]!=(char) -1)
			{
			 System.out.println(count+" --->"+ch[i]);
			}
		}
	
	}
}
