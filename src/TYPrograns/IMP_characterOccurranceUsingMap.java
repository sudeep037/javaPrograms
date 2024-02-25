package TYPrograns;

import java.util.HashMap;
import java.util.Map.Entry;

public class IMP_characterOccurranceUsingMap {

	public static void main(String[] args) {
		
		String s = "tester";
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();
		for(int i = 0; i<s.length(); i++)
		{
			if(map.containsKey(s.charAt(i)))
			{
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
			else {
				map.put(s.charAt(i), 1);
			}
		}
		for(Entry<Character, Integer> m : map.entrySet())
		{
			
			System.out.println(" "+m.getKey()+" ----> "+m.getValue());
		}
	}
}
