package coll_ection;

import java.util.ArrayList;
import java.util.Iterator;

public class Con_Modi_Excep {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		
		Iterator i=a.iterator();
		while(i.hasNext()) {
			a.remove(3);                        //ConcurrentModificationException
			System.out.println(i.next());
		}
	}
}
