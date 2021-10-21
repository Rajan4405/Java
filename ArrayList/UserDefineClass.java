package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
class Emp
{
	String name, cmpname;
	int age;
	Emp(String name, String cmpname, int age){
		this.name = name;
		this.age = age;
		this.cmpname = cmpname;
	}
	public String toString() {
		return name+" "+cmpname+" "+age;
	}
	
	public void show() 
	{
		System.out.println(age+" "+name+" "+cmpname);
	}
}


public class UserDefineClass
{
	
	public static void main(String args[]) {
		ArrayList<Emp> arrayList = new ArrayList<Emp>();
		Emp e = new Emp("rajan", "amazone", 24);
		Emp e1= new Emp("Hari", "NicAsia", 22);
		arrayList.add(e);
		arrayList.add(e1);
		
		System.out.println(arrayList);
		
//		Iterator <Emp> iterator = arrayList.iterator();
//		
//		while( iterator.hasNext()) {
//			Emp emp = (Emp) iterator.next();
//			emp.show();
//			System.out.println(emp.name+" "+emp.age +" "+emp.cmpname);
//		}
		//arrayList.forEach((a)-> System.out.println(a));
		
		ListIterator <Emp> LIterator = arrayList.listIterator();
		System.out.println("List Ierator in forward in backward directionnn.....");
		while(LIterator.hasNext()) {
			Emp emp = (Emp) LIterator.next();
			emp.show();
			
		}
		
		System.out.println("List Ierator in backward in backward directionnn.....");
		
		while(LIterator.hasPrevious()) {
			Emp emp = (Emp) LIterator.previous();
			emp.show();
			
		}
	}
}
