import java.util.TreeSet;

public class treeSet {
public static void main(String[] args) {
	TreeSet<Integer> set = new TreeSet<>();
	set.add(10);
	//set.add("string"); //allows only homo data
	set.add(20);
	set.add(60);
	set.add(25);
	System.out.println(set);
	System.out.println(set.descendingSet());
}
}
