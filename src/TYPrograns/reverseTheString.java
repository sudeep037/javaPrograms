package TYPrograns;

public class reverseTheString {

	//Approach1 ---> take empty string
	//Approach2 ---> 
	
	public static void main(String[] args) {
		
		String s = "Bangalore";
		String s1 = "";
		
		for(int i = s.length()-1; i>=0; i--)
		{
			s1 = s1+s.charAt(i);
		}
		System.out.println(s1);
		
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		System.out.println(sb);
		
		StringBuilder sbuild = new StringBuilder(s);
		sbuild.reverse();
		System.out.println(sbuild);
	}
	
}
