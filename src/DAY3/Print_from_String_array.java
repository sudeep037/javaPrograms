package DAY3;

public class Print_from_String_array {

	public static void main(String[] args) {
		 String[] s= {"a","ab","abcd","e","abcde"};//a e
		 String min_length=s[2];//assumed
		 for(int i=0;i<s.length;i++) 
		 {
			
			 if(s[i].length()<min_length.length()) 
			 {
				 min_length=s[i];
				 System.out.println(min_length);   // a
			 } 
			  
		 }
		 for(int i=0;i<s.length;i++) 
		 {
			 if(s[i].length()==min_length.length())  
			 {
				 System.out.print(s[i]+" ");
			 }
		 }

	}
}
