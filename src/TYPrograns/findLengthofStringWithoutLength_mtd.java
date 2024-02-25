package TYPrograns;

public class findLengthofStringWithoutLength_mtd {

	public static void main(String[] args) {
		
		String s = "TestYantra";
		String[] str = s.split("");
		int count = 0;
		for(String s1 : str)
		{
			count++;
		}
		System.out.println(count);
		
		
	}
}
