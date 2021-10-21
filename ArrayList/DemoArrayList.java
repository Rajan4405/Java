package ArrayList;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoArrayList
{
	
//	public String toString() {
//		return "[]";
//	}

	public static void main(String[] args)
	{
//		DemoArrayList d = new DemoArrayList();
//		System.out.println(d);
		/*
		 * 
		ArrayList arrayList = new ArrayList(); // default constructor
		System.out.println(arrayList);
		arrayList.add(10);
		arrayList.add(10.6);
		arrayList.add("Hello");
		arrayList.add("bye");
		arrayList.add(10);
		arrayList.add(10);
		arrayList.add(10.6);
		arrayList.add("Hello");
		arrayList.add("bye");
		
		System.out.println(arrayList);
		*/
		
		
		
		List arrayList = new ArrayList();
		arrayList.add("hi:");
		arrayList.add(10);
		arrayList.add(11);
		arrayList.add(13);
		
		
		ArrayList arrayList1 = new ArrayList(arrayList);
		ArrayList arrayList2 = new ArrayList(10);
		arrayList1.add("new");
		arrayList1.add("see ya");
		
		System.out.println(arrayList1);
		arrayList1.add(2, 45);
		System.out.println(arrayList1);
		arrayList1.set(2, 60);
		System.out.println(arrayList1);
		System.out.println(arrayList2.isEmpty());
		System.out.println(arrayList1.size());
		System.out.println(arrayList1.contains("news"));
		System.out.println(arrayList1.get(4));
//		arrayList1.removeAll(arrayList);
		System.out.println(arrayList1);
		arrayList1.retainAll(arrayList);
		System.out.println(arrayList1);
		
		
//		for(int i=0; i<arrayList1.size(); i++) {
//			System.out.println(arrayList1.get(i));
//		}
		
//		for(Object i : arrayList1) 
//			System.out.println(i);
		
		/*
		 * interface Iterator
		 * {
		 * }
		 * interface collection
		 * {
		 * 	public abstract Iterator iterator();
		 * }
		 * 
		 * interface List extends Collection
		 * {
		 * 	public abstract Iterator iterator();
		 * }
		 * 
		 * class ArrayList implements List
		 * {
		 * 
		 *  class Itr implements Iterator
		 *  {
		 *  }
		 * 	public Iterator iterator()
		 *  {
		 *  	return new Itr;	
		 *  }
		 * }
		 * */
		Iterator i = arrayList1.iterator();
		System.out.println(i);
		while(i.hasNext()) {
			Object obj = (Object) i.next();
			System.out.println(obj);
		}
		
	
		
	}


}
