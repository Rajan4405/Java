package SET;


public class HashCodeDemo
{
	public static void main(String[] args)
	{

		HashCodeDemo d = new HashCodeDemo();
		
		System.out.println(d);
//		int i = d.hashCode();
//		System.out.println(i);
		
		String s = Integer.toHexString(d.hashCode());
		System.out.println(s);
		
//	Class c	= d.getClass();
//	System.out.println(c);
//	System.out.println(c.getName());
	 
		
		Class c = d.getClass();
	  String dd = c.getName()+"@"+s;
	  System.out.println(dd);
	}
	
	
}
