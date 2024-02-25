package TYPrograns;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class stringOccuranceUsingMaps {

	public static void main(String[] args) {
		
		String value = "Hi Hello Hi Hello Welcome";
		String[] value1 = value.split(" ");
		  
		  LinkedHashMap<String, Integer> map = new LinkedHashMap<String,Integer>();
		  
		  for(int j = 0; j<value1.length-1; j++)
		  {
			  if(map.containsKey(value1[j]))
			  {
				  map.put(value1[j], map.get(value1[j])+1);
			  }
			  else {
				  map.put(value1[j], 1);
			  }
		  }
		  for(Entry<String, Integer> m : map.entrySet())
		  {
			  if(m.getValue()>=1)
			  {
				  System.out.println(m.getKey()+" ---> "+m.getValue());
			  }
			  else {
				  System.out.println(m.getKey()+" ---> "+m.getValue());
			  }
		  }
	}
}		
