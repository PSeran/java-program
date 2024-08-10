package set_interface;

//import java.util.Iterator;
import java.util.LinkedHashSet;
public class Lin_Has_Set {

	public static void main(String[] args) {
		LinkedHashSet lh= new LinkedHashSet();
		lh.add(12);
		lh.add("sachine");
		lh.add('q');
		lh.add(null);
		lh.add("yuvarj");
		lh.add(12);
		lh.add('q');
		
		lh.add("anil");
		System.out.println(lh);  //[12, sachine, q, null, yuvarj, anil]
		lh.removeAll(lh);
		System.out.println("after removeAll***:"+lh);//after removeAll***:[]

	}

}
