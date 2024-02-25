import java.util.Hashtable;

public class hashTable {

	public static void main(String[] args) {
		Hashtable<Integer, Object> map = new Hashtable<Integer,Object>();
		map.put(10, "hi");
		map.put(20, 'a');
		//map.put(null, 30); // not allow
		//map.put(5, null);// not allowed
		map.put(30, 40);
		map.put(40, "String");
		System.out.println(map);
	}
}
