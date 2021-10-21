package Treeset;

import java.util.Comparator;

public class AgeComp implements Comparator
{

	@Override
	public int compare(Object o1, Object o2)
	{
		Employee obj1 = (Employee)o1;
		Employee obj2 = (Employee)o2;
		
		if(obj1.age > obj2.age)
			return 1;
		else if(obj1.age < obj2.age)
			return -1;
		else 
			return 0;
					
	

	}
	
}
