package DAY3;

public class Number_sorting_from_string {

	public static void main(String[] args) {
		 String s1="Test45ya756nt2ra1234";//1234 2 756 45
		 String[] s = s1.split("[^0-9]");   // [45 756 2 1234] 
		 
		 for(int i=s.length-1;i>=0;i--) 
		 {
			 System.out.println(s.length);
			 System.out.println(s[i]);
		 }

	}
}
