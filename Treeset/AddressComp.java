package Treeset;

import java.util.Comparator;

public class AddressComp implements Comparator
{
	public int compare(Object o1, Object o2) {
		Employee obj1 = (Employee)o1;
		Employee obj2 = (Employee)o2;
		
		return obj1.address.compareTo(obj2.address);
	}

}
