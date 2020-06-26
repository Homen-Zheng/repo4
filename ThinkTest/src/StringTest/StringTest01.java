package StringTest;

public class StringTest01 {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		Integer i1 = 127;
		Integer i2 = 127;
		
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
		
		Integer i3 = new Integer(128);
		Integer i4 = new Integer(128);
		System.out.println(i3.equals(i4));
		System.out.println(i3 ==i4);
		
	}

}
