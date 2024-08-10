package coll_ection;

import java.util.ArrayList;

public class Remove_element {

	public static void main(String[] args) {
//        ArrayList<String> south=new ArrayList<String>();
		ArrayList south=new ArrayList();
		
//		south.add("kuzhi paniyaram");
//		south.add("idli uppma");
		south.add("dosa");
//		south.add("curd rice");
		south.add("rice");
		
		
		//removeAll(Collection c)
//		south.removeAll(south);    //[]
		south.add("gulab jamun");
		System.out.println(south);   
//		System.out.println(south.removeAll(south));  //true
		
		
		ArrayList north=new ArrayList();
		north.add("roti");
		north.add("paneer butter masala");
		north.add("rice");
		north.add("gulab jamun");
		
		//retaiinAll(collection)  it is both north and south same type of data only print
		north.retainAll(south);
		System.out.println(north);
		
		
		
		//remove(int index)
		System.out.println(north.remove(2));

	}

}
