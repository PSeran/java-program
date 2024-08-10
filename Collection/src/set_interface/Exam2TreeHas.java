package set_interface;

import java.util.TreeSet;

public class Exam2TreeHas {
	public static void main(String[] args) {
		TreeSet<String> t=new TreeSet<String>();
		t.add("iran");
		t.add("Iran");
		t.add("India");
		t.add("eliya"); 
		t.add("iran");//it follow sort order
		System.out.println(t);//[India, Iran, eliya, iran]

	}
}
