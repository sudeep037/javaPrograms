package DAY3;

public class CountOfString {

	public static void main(String[] args) {
		 String s="a1b2c3";
		 int temp=0;
		 int sum=0;
		 String s1=s.replaceAll("[^0-9]", "");
		 System.out.println(s1);
		 int a=Integer.parseInt(s1);
		 while(a!=0)
		 {
          temp=a%10;
          sum=sum+temp;
          a=a/10;
			 
		 }
		 System.out.println(sum);

	}
	
	public void SumofNum() 
	{
		String s="a1b2c3";
		int sum=0;
		for(int i=0;i<s.length();i++) 
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9') 
			{
				int n=s.charAt(i)-48;
				sum=sum+n;
			}
		}
		System.out.println(sum);
	}
}
