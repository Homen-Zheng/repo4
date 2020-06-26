package ThinkTest01;

public class ThinkTest005 {
	public static void main(String[] args) {
		Integer i1 = new Integer(10);
		System.out.println(i1);
		Integer i2 = Integer.valueOf("10");			
		System.out.println(i2);
		
		String i3 = i2.toString();
		System.out.println(i3);
		
		int a = i2.intValue();
		System.out.println(a);
		
		byte i4 = Byte.MAX_VALUE;
		System.out.println(i4);
		
		int i5 = 101;
		String i6 = i5+" ";
		System.out.println(i6);
		
		i6="101";
		int i7 = Integer.parseInt(i6);
		System.out.println(i7);
		
		/*
		Integer a1 = 127;
		Integer a2 = 127;
		System.out.println(a1.equals(a2));
		System.out.println(a1 == a2);
		*/
		
		Integer a1 = 128;
		Integer a2 = 128;
		System.out.println(a1.equals(a2));
		System.out.println(a1 == a2);
	}

}
