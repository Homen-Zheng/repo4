package ThinkTest01;


class OuterClass{
	public void m1(){
		final int i = 10;
		class InnerClass{
			public void m2(){
				System.out.println(i);
			}
		}
		InnerClass inner = new InnerClass();
		inner.m2();
	}
}
public class ThinkTest002 {
	public static void main(String[] args) {
		OuterClass OC = new OuterClass();
		OC.m1();
	}

}
