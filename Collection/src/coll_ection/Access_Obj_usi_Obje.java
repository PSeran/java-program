package coll_ection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Emp_loye{
	int eid;
	String ename;
	


        Emp_loye(int eid, String ename) {
		this.eid=eid;
		this.ename=ename;
	}
//        public String toString() {
//        	return "eid:"+eid+" ,enmae:"+ename;
//        }
	
}
public class Access_Obj_usi_Obje {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		 Emp_loye e1=new Emp_loye(2,"sri");
		 Emp_loye e2=new Emp_loye(3,"ram");
		 Emp_loye e3=new Emp_loye(12,"seran");
		 
		 ArrayList<Emp_loye> i=new ArrayList<Emp_loye>();
		 i.add(e1);
		 i.add(e2);
		 i.add(e3);
		 
		 Iterator<Emp_loye> l=i.iterator();
		 boolean flag=false;
		 System.out.println("**enter the id no:**");
		 int id=s.nextInt();
		 while(l.hasNext()) {
			 Emp_loye e=l.next();
			 if (id==e.eid) {
				 flag=true;
				 System.out.println("it is found "+e.ename);
				 break;
				
			}
		 }
		 if (!flag) {
			 System.out.println("it is not found");
			
		}
		 s.close();
	}

}
