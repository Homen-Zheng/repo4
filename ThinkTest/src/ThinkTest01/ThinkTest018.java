package ThinkTest01;

public class ThinkTest018 {

	private static ThinkTest018 t;
	private ThinkTest018(){};
	
	public static ThinkTest018 getSingle(){
		if (t == null){
			  t = new ThinkTest018();
			}
			return t;
	}
	
}
