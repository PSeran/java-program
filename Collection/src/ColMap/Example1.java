package ColMap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Example1 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
//		Map m=new HashMap();
		Map<Integer,String> m=new HashMap<Integer,String>();
		m.put(1, "seran");  ///hasmap not allow duplicate eliment
		m.put(2, "haran");
		m.put(3, "girish");
//		Set s=m.entrySet();
//		Iterator i=s.iterator();
//		while (i.hasNext()) {
//			Map.Entry entry=(Map.Entry )i.next();
//			System.out.println(entry.getValue());
//			
//		}
		
//		for(Map.Entry e:m.entrySet()) {
//			System.out.println(e.getKey()+ " "+e.getValue());
//		}
		
		m.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		m.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
		
	}

}
