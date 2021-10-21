package Map;
/*
 * interface Map
 * {
 * interface Entry
 * {
 * }
 * }
 *  Map.Entry //for call Entry  
 */
import java.util.*;
public class MapDemo
{

	public static void main(String[] args)
	{
		Map<String,String> hm = new  HashMap<String, String>();
		hm.put("555", "Rajan");
		hm.put("444", "Raj");
		hm.put("333", "Ram");
		hm.put("222", "Raja");
		hm.put("222", "Hero");
		
		
		System.out.println(hm);
		
		System.out.println(hm.size());
		System.out.println(hm.isEmpty());
		System.out.println(hm.containsKey("100"));
		System.out.println(hm.containsKey("001"));
		System.out.println(hm.containsValue("Rajan"));
		System.out.println(hm.get("444"));
		
		Set sk = hm.keySet();
		Iterator ktr = sk.iterator();
		System.out.println("**********Keys********");
		while(ktr.hasNext()) {
			System.out.println(ktr.next());
		}
		
		Collection cl = hm.values();
		Iterator vtr = cl.iterator();
		System.out.println("*******Values*********");
		while(vtr.hasNext()) {
			System.out.println(vtr.next());
		}
		
		Set se = hm.entrySet();
		Iterator etr = se.iterator();
		System.out.println("**********Entries********");
		while(etr.hasNext()) {
			System.out.println(etr.next());
		}
	}


}
