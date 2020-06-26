package ThinkTest01;

public class ThinkTest004 {
	public static void main(String[] args) {
		String name = "abcdmy-favior-love";
		//byte[] bytes = new byte[13];
		System.out.println(name.charAt(5));
		System.out.println(name.endsWith("a"));
		System.out.println(name.endsWith("¾Æ"));
		System.out.println(name.startsWith("a"));
		System.out.println(name.startsWith("b"));
		
	    byte[] bytes = name.getBytes();
		for(int i = 0;i<bytes.length;i++){
			if(i != bytes.length-1){
				System.out.print(bytes[i]);
			}else{
				System.out.println(bytes[i]);
			}
		}
		
		System.out.println(name.length());
		
		//´óÐ¡Ð´
		System.out.println(name.equalsIgnoreCase("Abcdmy favior love"));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		
		//Ë÷Òý
		System.out.println(name.indexOf("l"));
		System.out.println(name.indexOf('a',1));
		System.out.println(name.indexOf("a", 1));
		
		String[] myname = name.split("-");
		for(int i = 0;i<myname.length;i++){
			if(i != myname.length-1){
				System.out.print(myname[i]);
			}else{
				System.out.println(myname[i]);
			}
		}
		
		char[] c = name.toCharArray();
		for(int i = 0;i<c.length;i++){
			if(i != c.length-1){
				System.out.print(c[i]);
			}else{
				System.out.println(c[i]);
			}
		}

	}

}
