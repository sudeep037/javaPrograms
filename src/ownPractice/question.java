package ownPractice;

import java.util.Scanner;

public class question {

	public static void main(String[] args) {
		
		String s = "Hello 768945 world";
		String[] value = s.split(" ");
		for(int i = 0; i<value.length; i++)
		{
			reverseString(value[i]);
		}
	}
	
	public static void reverseString(String value)
	{
		String s = "";
		for(int i = value.length()-1; i>=0; i--)
		{
			if(value.equalsIgnoreCase("768945"))
			{
			    System.out.println(value);
			    bubbleSort(value);
			    break;
			}
			else {
			   s = s + value.charAt(i);
			}
		}
	}
	
	public static void bubbleSort(String value)
	{
		char[] ch = value.toCharArray();
		for(int i = 0; i<ch.length; i++)
		{
            for(int j = i+1; j<ch.length; j++)
            {
            	if(ch[j-1]>ch[j])
            	{
            		char temp = ch[j];
            		ch[j]=ch[j-1];
            		ch[j-1]=temp ;
            	}
            }	
		}
		for(int i = 0; i<ch.length; i++)
		{
		System.out.print(ch[i]+" ");
		}
	}
}
