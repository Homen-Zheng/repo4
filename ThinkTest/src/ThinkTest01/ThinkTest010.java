package ThinkTest01;

import java.util.*;

public class ThinkTest010 {
	public static void main(String[] args) {
		List l = new ArrayList();
		
		l.add(10);
		l.add(20);
		l.add(50);
		l.add(21);
		l.add(35);
		l.add(66);
		Iterator it = l.iterator();
		
		for(int i = 0;i<l.size();i++){
			System.out.println(l.get(i));
		}
		/*while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println(l.size());
		System.out.println(l.isEmpty());
		Object[] obj = l.toArray();
		for(int i = 0;i<obj.length;i++){
			System.out.println(obj[i]);
		}
		l.remove(66);
		System.out.println(l.size());
		System.out.println(l.contains(21));
		l.clear();
		
		System.out.println(l.size());
		System.out.println(l.isEmpty());
		*/
	}

}
