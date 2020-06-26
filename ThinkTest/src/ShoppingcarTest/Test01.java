package ShoppingcarTest;

public class Test01 {

	public static void main(String[] args) {
		//创建购物车
		Car cart = new Car();

		//货物
		Product p1 = new Product("iphone4s",1000,10.0);
		Product p2 = new Product("samsung",2000,3.0);
		Product p3 = new Product("HTC",3000,6.0);
		Product p4 = new Product("小米",4000,2.0);
		
		//开始购物
		cart.add(p1);
		cart.add(p2);
		cart.add(p1,3);
		cart.add(p3);
		cart.add(p4);
		
		cart.remove(p1,2);
		
		//打印详单
		cart.print();
		
		//清空
		cart.clear();
		
		cart.print();
		
	}

}
