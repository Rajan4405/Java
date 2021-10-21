package Map;

import java.util.*;
public class HasgTableDemo
{
	public static void main(String[] args)
	{

		Hashtable hm = new Hashtable();
		System.out.println(hm.put("001", "ram"));
		hm.put("001", "sham");
		hm.put("003", "mohan");
		System.out.println(hm);
	}
}
