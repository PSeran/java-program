package coll_ection;

import java.util.ArrayList;

import java.util.Iterator;

public class Access_element {
	public static void main(String[] args) {
		ArrayList cirk=new ArrayList();
		cirk.add("kabil");
		cirk.add("sachine");
		cirk.add("yuvarj");
		cirk.add("anil");
		

		
//		to access a element
//		two ways
		
//		1
//		Iterator()  it is autometicly create a class of instance/object
		Iterator i=cirk.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
//		or
		
//		2
//		using for each loop
		for(Object o:cirk) {
			System.out.println(o);
		}
		
	}

}
