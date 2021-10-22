package Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo
{

	public static void main(String[] args)
	{
		PriorityQueue queue = new PriorityQueue();
		queue.add("abhi");
		queue.add("ram");
		queue.add("shavi");
		queue.add("kabi");
		queue.add("sham");
		
		System.out.println("head = "+queue.element());
		System.out.println("head = "+queue.peek());
		System.out.println(queue);
		
		Iterator itr =queue.iterator();
		while(itr.hasNext()) {
			Object obj = (Object) itr.next();
			System.out.println(obj);
		}
		
		System.out.println("Remove "+queue.remove());
		System.out.println("poll "+queue.poll());
	}


}
