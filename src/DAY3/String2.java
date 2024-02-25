
package DAY3;

public class String2 {

	public static void main(String[] args) {
		 String s1="Hi Hello Welcome To";//iH emocleW olleH oT 
		 String[] s= s1.split(" ");

		 for(int i=s.length-1;i>=0;i--) 
		 {
			 String s2=s[i];
			 if(s2.length()>5) 
			 {
			   
				 for(int k=s2.length()-1;k>=0;k--) 
				 {
					 System.out.print(s2.charAt(k));
				 }
				 System.out.print(" ");
				 
			 }else {
			 for(int j=s2.length()-1;j>=0;j--) 
			 {
				 System.out.print(s2.charAt(j));
			 }
			 System.out.print(" ");
		 }
		 }
	}
}
