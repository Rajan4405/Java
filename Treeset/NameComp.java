package Treeset;

import java.util.Comparator;

public class NameComp implements Comparator
{

	@Override
	public int compare(Object o1, Object o2)
	{
		Employee obj1 = (Employee)o1;
		Employee obj2 = (Employee)o2;
		return obj1.name.compareToIgnoreCase(obj2.name);
	}

}
