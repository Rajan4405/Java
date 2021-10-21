package Map;

import java.util.TreeMap;

public class TreeMapDemo
{

	public static void main(String[] args)
	{
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(555,"Rajan");
		tm.put(001, "Mohan");
		tm.put(444,"Raj");
		tm.put(002, "Raman");
		System.out.println(tm);
		

	}


}
