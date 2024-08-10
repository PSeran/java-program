package map_Interface;

import java.util.Map.Entry;

import java.util.TreeMap;

public class Tree_Map_Exmp {

	public static void main(String[] args) {
		TreeMap tm=new TreeMap();
		tm.put("zhara", 90);
		tm.put("renu", 100);
		tm.put("abi",200);
		
		TreeMap tm1=new TreeMap();
		tm1.put("vishu", 200);
		tm1.putAll(tm);
		System.out.println(tm1);
		Entry s=tm1.lastEntry();
		System.out.println(s);//zhara=90

	}

}
