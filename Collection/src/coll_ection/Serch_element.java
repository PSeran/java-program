package coll_ection;

import java.util.ArrayList;

public class Serch_element {

	public static void main(String[] args) {
	    ArrayList l1=new ArrayList();
	    ArrayList l2=new ArrayList();
	    
	    l1.add(10);
	    l1.add(20);
	    l1.add("mit");
	      l2.addAll(l1);
	      l2.add(100);
	      System.out.println(l2);                //[10, 20, mit, 100]
	      System.out.println(l1.containsAll(l2));//false
	      System.out.println(l2.containsAll(l1));//true

	}

}
