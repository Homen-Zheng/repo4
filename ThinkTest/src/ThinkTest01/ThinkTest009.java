package ThinkTest01;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class ThinkTest009 {
	public static void main(String[] args) {
		SortedSet m = new TreeSet();
		m.add(12);
		m.add(105);
	    m.add(18);
		m.add(14);
		m.add(16);

		Iterator it = m.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		SortedSet m1 = new TreeSet();
		String s1 ="abcd";
		String s2 ="jack";
		String s3 ="kkkk";
		String s4 ="chni";
		String s5 ="ijji";
		
		m1.add(s1);
		m1.add(s2);
		m1.add(s3);
		m1.add(s4);
		m1.add(s5);
		
		Iterator it1 = m1.iterator();
		while(it1.hasNext()){
			System.out.println(it1.next());
		}
		
		Date d1 = new Date(1000);
		Date d2 = new Date(2000);
		Date d3 = new Date(3000);
		Date d4 = new Date(1000*1000);
		Date d5 = new Date(1000*1085);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		
		SortedSet m2 = new TreeSet();
		m2.add(sdf.format(d1));
		m2.add(sdf.format(d2));
		m2.add(sdf.format(d3));
		m2.add(sdf.format(d4));
		m2.add(sdf.format(d5));
		
		Iterator it2 = m2.iterator();
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
	}

}
