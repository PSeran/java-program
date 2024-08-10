package map_Interface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Has_Map_Example {
	public static void main(String[] args) {
		HashMap m=new HashMap();
		m.put("sefeiou", 100);
		m.put("searn", 18900);
		m.put("akffuh", 1200);
//		m.containsKey("searn");
//		m.containsValue(100);
//		System.out.println(m);  //{akffuh=1200, searn=18900, sefeiou=100}
		Set s=m.keySet();
//		System.out.println("KeySet value:"+s);  //KeySet value:[akffuh, searn, sefeiou]
		Collection c=m.values();
//		System.out.println("Print values:"+c); //Print values:[1200, 18900, 100]
		Set s1=m.entrySet();
//		System.out.println("Entries are"+s1);//Entries are[akffuh=1200, searn=18900, sefeiou=100]
		Iterator i=s1.iterator();
		while(i.hasNext()) {
//			System.out.println(i.next());
			Map.Entry me=(Map.Entry)i.next();
//			System.out.println(me.getKey()+"  :  "+me.getValue());
			if (me.getKey().equals("searn")) {
				me.setValue(555);
				
			}
			System.out.println(me);//akffuh=1200 	searn=555	sefeiou=100

		

		}	
		
	}

}
