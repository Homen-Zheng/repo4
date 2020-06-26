package ThinkTest01;

import java.util.*;

public class ThinkingTest011 {
	public static void main(String[] args) {
		
		SortedSet ss = new TreeSet();
		
		ss.add(20);
		ss.add(21);
		ss.add(5);
		ss.add(25);
		ss.add(21);
		ss.add(50);
		
		System.out.println(ss.size());
		
		Iterator it =ss.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}

	}

}
