package DAY3;

public class Print_from_String_array1 {

	public static void main(String[] args) {
		 String[] s= {"1","12","1234","5","35346"};
		 String min_length=s[4];//selecting ramdaomly
		 for(int i=0;i<s.length;i++) 
		 {
			 if(s[i].length()<min_length.length()) 
			 {
				min_length=s[i]; //storing the minimum length value among all
			 }
		 }
		 for(int j=0;j<s.length;j++) 
		 {
			 if(s[j].length()==min_length.length()) 
			 {
				 System.out.print(s[j]+" ");//printing all minimum length value
			 }
		 }
	}
}
