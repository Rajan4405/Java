package SET;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



class Employee
{
int id;
String name, address;

Employee(int id,String name, String address)
{
	this.id = id;
	this.name = name;
	this.address = address;
}

void show()
{
	System.out.println(id+" "+name+" "+address);	
}

public int hashCode() 
{
	
	return id*10;
}

public boolean equals(Object o)
{
	Employee e = (Employee)o;
	if(this.id == e.id) 
		return true;
	else
		return false;
	
}

@Override
public String toString()
{

	return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";

}

	
}


public class HasSetDemo
{
	public static void main(String[] args)
	{
		
		Employee e1 = new Employee(2000,"Hari", "Butwal");
		Employee e = new Employee(1000,"Rajan", "Manigram");
		Employee e2 = new Employee(3000,"Mehul", "Nayagau");
		Employee e3 = new Employee(3000,"Mehul", "Nayagau");

//		System.out.println(e.hashCode());
//		System.out.println(e1.hashCode());
//		System.out.println(e2.hashCode());
//		System.out.println(e3.hashCode());
		
		Set<Employee> emp = new HashSet<Employee>();
		emp.add(e);
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		System.out.println(emp);
		
		Iterator<Employee> itr = emp.iterator();
		
		while(itr.hasNext()) {
			Employee type = (Employee) itr.next();
			type.show();
		}
	}
}
