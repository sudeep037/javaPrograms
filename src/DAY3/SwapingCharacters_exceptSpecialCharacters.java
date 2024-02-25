package DAY3;

public class SwapingCharacters_exceptSpecialCharacters {

	public static void main(String[] args) {
		 String s1="09#sol^ut#io$n&s";//sn#oit^ul#os$9&0
        String s = s1.replaceAll("[^0-9A-Za-z]", "");
         System.out.println(s);   //-->09solutions
		 int a=s.length()-1;
		 for(int i=0;i<s1.length();i++) 
		 {
		  if(s1.charAt(i)>='0' && s1.charAt(i)<='9' || s1.charAt(i)>='a'&&s1.charAt(i)<='z'||s1.charAt(i)>='A'&&s1.charAt(i)<='Z') 
		  {
			  System.out.print(s.charAt(a--));
		  }else 
		  {
			  System.out.print(s1.charAt(i));  
		  }
		  }
	
		}
}
