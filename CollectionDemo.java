import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
 * public static void sort(List l);
 * public static int binarySearch(List l, Object element);
 * public static void reverse(List L);
 * public static void shuffle(List L);
 * public static Object min(Collection c);
 * public static Object max(Collection c);
 * 
 * public static Collection    unmodifiableCollection(Collection c);
 * 
 *  public static Map unmodifiableMap(Map m);
 *  
 *  public static Collection synchronizedCollection(Collection c);
 *  
 * 
 * */
public class CollectionDemo
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add("one");
		al.add("four");
		al.add("three");
		al.add("two");
		al.add("five");
		
		System.out.println(al);
		
		Collections.reverse(al);
		System.out.println(al);
		
		Collections.shuffle(al);
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);
		
		System.out.println("Min " +Collections.min(al));
		System.out.println("Max "+Collections.max(al));
		
		System.out.println("*******List*********");
		List l = Collections.unmodifiableList(al);
		
		Iterator itr = l.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	

}
