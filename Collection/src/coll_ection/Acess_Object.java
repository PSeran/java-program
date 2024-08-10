package coll_ection;

import java.util.ArrayList;

class Employee{
	int eid;
	String name;
	
	public Employee(int eid,String name) {
		this.eid=eid;
		this.name=name;
	}
	@Override
	public String toString() {
		return "name"+name+", eid"+eid;
	}
	
}
public class Acess_Object {
	public static void main(String[] args) {
		Employee e1=new Employee(2, "seran");
		Employee e2=new Employee(32, "praveen");
		Employee e3=new Employee(62, "haran");
		
		ArrayList i=new ArrayList();
		i.add(e1);
		i.add(e2);
		i.add(e3);
		
		System.out.println(i);
	}

}
