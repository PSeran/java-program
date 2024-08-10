package coll_ection;

import java.util.ArrayList;
import java.util.Collections;

public class Collect_Demo {
	public static void main(String[] args) {
		ArrayList cirk=new ArrayList();
		cirk.add("kabil");
		cirk.add("sachine");
		cirk.add("yuvarj");
		cirk.add("anil");
		Collections.sort(cirk);
		System.out.println(cirk);
		System.out.println(Collections.binarySearch(cirk, "anil"));
//		System.out.println(Collections.binarySearch(cirk, "yuvarj", c));
	}

}
