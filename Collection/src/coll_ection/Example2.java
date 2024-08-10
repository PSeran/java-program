package coll_ection;

import java.util.ArrayList;

public class Example2 {

	public static void main(String[] args) {
//		ArrayList north=new ArrayList();
		ArrayList south=new ArrayList();
		
		south.add("kuzhi paniyaram");
		south.add("idli uppma");
		south.add("dosa");
		south.add("curd rice");
//		south.addAll(north); not output come in south output 
		System.out.println(south);  //[kuzhi paniyaram, idli uppma, dosa, curd rice]
		
		ArrayList north=new ArrayList();
		north.add("roti");
		north.add("dal");
		north.add("aloo paratto");
		north.add("panner butter masala");
		
		//addAll(collection)
		north.addAll(south);
		
		//addAll(int index, Collection c)
//		north.addAll(1,south);
		
		
		
//		north.set(2, south);
		System.out.println(north);//[roti, kuzhi paniyaram, idli uppma, dosa, curd rice, dal, aloo paratto, panner butter masala]
		

	}

}
