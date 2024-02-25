import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class day3 {

	public static void main(String[] args) {
		
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(10);
		list.add('A');
		list.add("string");
		list.add(null);  // adding multiple null values 
		list.add(null);
		System.out.println(list);
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(50);
		list1.add(30);
		list1.add(50);
		list1.add(70);
		Collections.sort(list1);
		System.out.println(list1);
		list.addAll(list1);
		System.out.println(list);
	}
}
