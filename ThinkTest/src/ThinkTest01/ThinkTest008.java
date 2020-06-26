package ThinkTest01;

import java.util.*;

public class ThinkTest008 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List c = new ArrayList();
		c.add(10);
		c.add(20);
		c.add(30);
		c.add(10);
		c.add(20);
		c.add(30);
		//Object[] obj = c.toArray();
		
		/*for(int i=0;i<obj.length;i++){
			System.out.println(obj[i]);
		}*/
		
		/*Iterator it = c.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}*/
		
		for(int i = 0;i<c.size();i++){
			System.out.println(c.get(i));
		}
		
	}

}
