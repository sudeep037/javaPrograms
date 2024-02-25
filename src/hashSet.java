import java.util.HashSet;

public class hashSet {

	public static void main(String[] args) {
		HashSet<Object> set = new HashSet<>();
		set.add(10);
		set.add('A');
		set.add("hi");
		set.add(null);
		set.add(null);
		System.out.println(set);
	}
}
