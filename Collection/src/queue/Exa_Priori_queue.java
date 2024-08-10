package queue;

import java.util.PriorityQueue;

public class Exa_Priori_queue {

	public static void main(String[] args) {
		PriorityQueue p=new PriorityQueue(4); //it's generic type PriorityQueue
		System.out.println(p.peek());
		p.add(12); 
		p.add(12);
		p.add(176);
		p.add(20);
		p.add(43);
//		p.add("qsgh");  // Exception in thread "main" java.lang.ClassCastException:
//		class java.lang.Integer cannot be cast to class java.lang.String
//		(java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')
//		at java.base/java.lang.String.compareTo(String.java:140)
//		at java.base/java.util.PriorityQueue.siftUpComparable(PriorityQueue.java:647)
//		at java.base/java.util.PriorityQueue.siftUp(PriorityQueue.java:639)
//		at java.base/java.util.PriorityQueue.offer(PriorityQueue.java:330)
//		at java.base/java.util.PriorityQueue.add(PriorityQueue.java:311)
//		at queue.Exa_Priori_queue.main(Exa_Priori_queue.java:15)
		
//		(duplicate allowed but hetroginious data only allow)
		
//		p.add("qsgh"); (duplicate allowed but hetroginious data only allow)
		System.out.println(p);
		System.out.println(p.poll());//poll() print first value

	}

}
