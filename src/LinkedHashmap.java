import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class LinkedHashmap {

	public static void main(String[] args) {
		LinkedHashMap<Integer, Object> map = new LinkedHashMap<Integer,Object>();
		map.put(10, "hi");
		map.put(20, 'a');
		map.put(null, 30); //  allowed null key
		//map.put(5, null);// not allowed
		map.put(30, 40);
		map.put(40, "String");
		map.put(null, "hello..");
		map.put(50, null);
		System.out.println(map);
	}
}
