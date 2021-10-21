package TraditionalCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ConcurrentTest extends Thread
{
	static HashMap hm = new HashMap();
	
	public void run() 
	{
		try
		{

			Thread.sleep(3000);

		} catch (InterruptedException e)
		{

			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		hm.put("4", "rajan");
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args)
	{

		hm.put("5", "ravi");
		hm.put("6", "ram");
		
		ConcurrentTest t = new ConcurrentTest();
		t.setName("My Thread");
		t.start();
		System.out.println(Thread.currentThread().getName());
		
		Set se = hm.entrySet();
		Iterator etr = se.iterator();
		System.out.println("**********Entries********");
		while(etr.hasNext()) {
			Map.Entry m = (Map.Entry)etr.next();
			//hm.put("5656", "divyansh");
			System.out.println(m.getKey()+":"+m.getValue());
			try
			{
				Thread.sleep(5000);
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(hm);
	}
}


