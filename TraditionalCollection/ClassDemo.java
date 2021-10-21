package TraditionalCollection;

/*
 * Traditional Vs. Concurrent Collection
 * Traditional- A.L,L.L, Vector, HashMap etc
 * 
 * problem
 * 1. Not thread safe. (Data Inconsistency) (e.g. A.L, HashSet, HashMap etc.)
 * 2. Vector , HashTable, synchronizedList() -- thread safe. -they are not up to the mark.
 * 3. If multiple thread perform read operation not an issue. but issue comes when thread perfotm write opration.
 * 
 * 
 * fail safe vs fail fast.
 * 
Concurrent- (eksath/parellel) 
	CopyOnWriteArrayList
	CopyOnWriteArraySet
	ConcurrentHashMap 
	etc.
*/

public class ClassDemo
{
	
	public static void main(String[] args)
	{

		
	}
}
