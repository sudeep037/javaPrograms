import java.util.HashMap;
import java.util.Hashtable;

public class hashMap {

	public static void main(String[] args) {
		HashMap<Integer, Object> map = new HashMap<Integer,Object>();
		map.put(10, "hi");
		map.put(20, 'a');
		//map.put(null, 30); // not allow
		//map.put(5, null);// not allowed
		map.put(30, 40);
		map.put(40, "String");
		map.put(null, "hello..");
		map.put(50, null);
		System.out.println(map);
	}
}
