package vector;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class DemoVector
{
	public static void main(String[] args)
	{
		Vector vector = new Vector();
		System.out.println(vector.capacity());
		System.out.println(vector.size());
		System.out.println(vector.isEmpty());
		
		vector.add(1);
		vector.add(10.7);
		vector.addElement(45);
		
		vector.add(699);
		vector.add(699);
		vector.add(1);
		vector.add(1);
		vector.add(1);
		vector.add(1);
		vector.add(1);
		vector.add(1);
		System.out.println(vector);
		System.out.println(vector.capacity());
		System.out.println(vector.size());
		System.out.println(vector.isEmpty());
		System.out.println("------------------------------");
		
		Vector v1 = new Vector(3);
		v1.add(23);
		v1.add(23);
		v1.add(23);
		v1.add(23);
		System.out.println(v1.capacity());
		System.out.println(v1.size());
		
		ArrayList a = new ArrayList();
		a.add(54);
		
		Vector v2 = new Vector(a);
		v2.add(12);
		System.out.println(v2);
		
		
		
		Vector v3 = new Vector(5,1);
		v3.add(13);
		v3.add(13);
		v3.add(13);
		v3.add(13);
		v3.add(13);
		v3.add(13);
		System.out.println(v3.capacity());
		System.out.println(v3.size());
		
		System.out.println("---------------------------");
		
		Enumeration enu = vector.elements();
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
		
		
	}

}
