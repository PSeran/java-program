package set_interface;

import java.util.TreeSet;

public class ExampleOfTreeS {

	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		t.add(42);
		t.add(10);
		t.add(1);
		t.add(87);
		System.out.println(t);//[1, 10, 42, 87]
		t.remove(10);
		System.out.println(t); //  [1, 42, 87]
		t.add("dark");
		System.out.println(t);//java.lang.ClassCastException: because treeSet 
		
		
		TreeSet<String> t1=new TreeSet<String>();
		t1.add("iran");
		t1.add("Iran");
		t1.add("India");
		t1.add("eliya");
		System.out.println(t1);


	}

}
