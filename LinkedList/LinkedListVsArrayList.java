package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListVsArrayList
{
	public static void main(String[] args)
	{

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		long startTime, endTime;
		
		//ArrayList 
		 startTime =System.nanoTime();
		
		for(int i=0; i<100000; i++) 
		{
			arrayList.add(i);
			
		}
		 endTime =System.nanoTime();
		System.out.println("ArrayList Add Time "+ (endTime - startTime));
		
		//LinkedList 
				 startTime =System.nanoTime();
				
				for(int i=0; i<100000; i++) 
				{
					linkedList.add(i);
					
				}
				 endTime =System.nanoTime();
				System.out.println("LinkedList Add Time "+ (endTime - startTime));
				
				
				

				//ArrayList
				 startTime =System.nanoTime();
				
				for(int i=0; i<100000; i++) 
				{
					arrayList.get(i);
					
				}
				 endTime =System.nanoTime();
				System.out.println("ArrayList get Time "+ (endTime - startTime));
				
				//LinkedList 
						 startTime =System.nanoTime();
						
						for(int i=0; i<100000; i++) 
						{
							linkedList.get(i);
							
						}
						 endTime =System.nanoTime();
						System.out.println("LinkedList get Time "+ (endTime - startTime));
						
						//ArrayList
						 startTime =System.nanoTime();
						
						for(int i=99999; i>0; i--) 
						{
							arrayList.remove(i);
							
						}
						 endTime =System.nanoTime();
						System.out.println("ArrayList remove Time "+ (endTime - startTime));
						
						//LinkedList 
								 startTime =System.nanoTime();
								
								for(int i=99999; i>0; i--) 
								{
									linkedList.remove(i);
									
								}
								 endTime =System.nanoTime();
								System.out.println("LinkedList remove Time "+ (endTime - startTime));
			
	}

}
