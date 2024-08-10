package coll_ection;

import java.util.ArrayList;

public class Example {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add("bullet pandi");
		l.add("kokki kumar");
		l.add("dumil kuppan voual");
		l.add(12);
		l.add(0,"keda ravi");
		System.out.println(l); 
		
		
//		kokki kumar said to blad ravi
		l.set(2, "blad ravi");
		System.out.println(l);
		
		
		
		l.remove("kokki kumar");
		System.out.println(l);
		
//		serach an element
//		contains(object o)
		System.out.println(l.contains("kokki kumar"));  //true or false
		
		

	}

}
