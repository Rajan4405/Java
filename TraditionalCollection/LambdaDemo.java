package TraditionalCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

class Employee
{
	String name;
	int age;
	float salary;
	
	Employee(String name, int age, float salary)
	{
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public void show() {
		System.out.println(name+" "+age+" "+salary);
	}
	
	public String toString() {
		return name+" "+age+" "+salary;
	}
}

public class LambdaDemo
{

	public static void main(String[] args)
	{
		Employee e = new Employee("Ram", 23, 6f);
		Employee e1 = new Employee("Shyam", 22, 7f);
		Employee e2 = new Employee("Mehul", 25, 10f);
		Employee e3 = new Employee("Hero", 18, 5f);
		
		List<Employee> arrayList = new ArrayList<Employee>();
		arrayList.add(e);
		arrayList.add(e1);
		arrayList.add(e2);
		arrayList.add(e3);
		
		System.out.println(arrayList);
		
		Collections.sort(arrayList, (a,b)->
		{
			return a.name.compareToIgnoreCase(b.name);
		});
		
		System.out.println(arrayList);
		
		arrayList.forEach(a -> System.out.println(a));
		
		Stream<Employee> f_data = arrayList.stream().filter(res -> res.age < 23);
		System.out.println("***Fdata*****");
		f_data.forEach(result-> System.out.println(result.age));
		
	}


}
