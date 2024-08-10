package ColMap;

import java.util.HashMap;
import java.util.Map;

public class Example2 {
	public static void main(String[] args) {
		HashMap<Integer, String> has=new HashMap<Integer,String>();
		has.put(120, "athithi");
		has.put(201, "reshma");
		has.put(321, "thilak");
		
//		has.get(new Key("reshma"));
		for (Map.Entry e :has.entrySet()) {
			System.out.println(e.getValue()+" "+e.getKey());
			
		}
		has.putIfAbsent(456,"snega");
		System.out.println("after putifAbsent");
		for (Map.Entry e :has.entrySet()) {
			System.out.println(e.getValue()+" "+e.getKey());
		}
		
		has.replace(120, "athithi", "shreya");
		System.out.println("ahter replaceing");
		for (Map.Entry e :has.entrySet()) {
			System.out.println(e.getValue()+" "+e.getKey());
		}
	}

}
