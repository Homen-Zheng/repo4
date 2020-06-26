package ThinkTest01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThinkTest006 {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		System.out.println(d);
		
		Date d1 = new Date(1000);
		System.out.println(d1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		System.out.println(sdf.format(d));
		String date2 = sdf.format(d1);
		System.out.println(date2);
		Date dd = sdf.parse(date2);
		System.out.println(dd);
		
		String name = "2008-08-08 18:08:06 666";
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		System.out.println(sdf1.parse(name));
	}

}
