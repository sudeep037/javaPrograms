package DAY3;

public class String1 {

	public static void main(String[] args) {
		 String s1="Hi Hello Welcome To";//To Hello Welcome Hi
		 String[] s2 = s1.split(" ");
		 for(int i=s2.length-1;i>=0;i--) {
		 if(i%2==1) 
		 {
			 System.out.println(s2[i]+" " );
		 }   
		 }
		 for(int j=s2.length-1;j>=0;j--) 
		 {
			 if(j%2==0) 
			 {
				 System.out.println(s2[j]+" ");
			 }
		 }
		 } 
}
