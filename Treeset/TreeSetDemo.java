package Treeset;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
/*
 * Problem with Comparable
 * 
 * */
class Employee //implements Comparable
{
	String name, address;
	int age;
	
	Employee(String name, String address, int age)
	{
		this.name = name ;
		 this.age = age;
		this.address = address;
	}
	@Override
	/*
	public int compareTo(Object o)
	{
		Employee e = (Employee)o;

//for integer		
//		if(this.age > e.age)
//			return 1;
//		else if(this.age < e.age)
//			return -1;
//		else	
//		return 0;
		
		
//		for String
		return this.name.compareTo(e.name);
		
//		ignoreCase
//		return this.name.compareToIgnoreCase(e.name);
	
	}
	*/
	
	public String toString() {
		return name+" "+address+" "+age;
	}
	
	public void show() {
		System.out.println(name+" "+address+" "+age);
	}
}

public class TreeSetDemo
{


	public static void main(String[] args)
	{
		Employee e  = new Employee("Rajan", "Manigram", 23);
		Employee e1  = new Employee("Raj", "Manigram", 22);
		Employee e2  = new Employee("Raja", "Manigram", 24);
		Employee e3  = new Employee("Hari", "btl", 21);
		Employee e4  = new Employee("Mehul", "pkr", 20);
		Employee e5  = new Employee("Rajan", "Manigram", 23);
		
	
		
		Comparator cname =  new NameComp();
		Comparator cage =  new AgeComp();
		Comparator caddress =  new AddressComp();
		

		TreeSet t = new TreeSet(cname);
		t.add(e);
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
//		t.add();
//		t.add("hero");
//		t.add(e);
		
		System.out.println(t);
		
		Iterator<Employee> i = t.iterator();
		while (i.hasNext())
		{

			Employee emp = (Employee) i.next();
			emp.show();

			
		}
		
		
	}


}
