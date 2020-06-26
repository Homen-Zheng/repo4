package ThinkTest01;

import java.util.Random;

public class ThinkTest007 {
	public static void main(String[] args) {
		Random r = new Random();
		int k =0;
		for(int j = 0;j<100;j++){
			int i = r.nextInt(100);
			if(i==99){
				k++;
				System.out.println(i);
			}
		}
		System.out.println(k);
	}

}
