package set_interface;

import java.util.*;
public class ExampleSet {

	public static void main(String[] args) {
		Integer[] a= {22,45,34,43,67,78};
		Integer[] b= {2,45,34,6,90,7};
		
		Set<Integer> s=new HashSet<Integer>();
		s.addAll(Arrays.asList(a));
		Set<Integer> s1=new HashSet<Integer>();
		s.addAll(Arrays.asList(b));
		 
		
		Set<Integer> s2=new HashSet<Integer>(s);
	    s2.addAll(s1);
	    System.out.println("addAll collection"+s2);
	    
	    Set<Integer> s3=new HashSet<Integer> (s);
	    
	    s2.retainAll(s1);
	    System.out.println("retainAll data"+s3);
		

	}

}
