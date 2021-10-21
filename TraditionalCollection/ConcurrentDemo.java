package TraditionalCollection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentDemo
{
	public static void main(String[] args)
	{
		Map<String,String> hm = new  ConcurrentHashMap<String, String>();
		hm.put("555", "Rajan");
		hm.put("444", "Raj");
		hm.put("333", "Ram");
		hm.put("222", "Raja");
		hm.put("222", "Hero");
		

		Set se = hm.entrySet();
		Iterator etr = se.iterator();
		System.out.println("**********Entries********");
		while(etr.hasNext()) {
			Map.Entry m = (Map.Entry)etr.next();
			hm.put("5656", "divyansh");
			System.out.println(m.getKey()+":"+m.getValue());
		}
	}
}
