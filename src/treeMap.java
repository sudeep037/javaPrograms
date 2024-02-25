import java.util.HashMap;
import java.util.TreeMap;

public class treeMap {

	public static void main(String[] args) {
		TreeMap<Integer, Object> map = new TreeMap<Integer,Object>();
		map.put(10, "hi");
		map.put(20, 'a');
		//map.put(null, 30); // not allow
		map.put(5, null);// allowed multiple null values
		map.put(30, 40);
		map.put(40, "String");
		//map.put(null, "hello.."); // not allowed null key
		map.put(50, null);
		System.out.println(map);
	}
}
