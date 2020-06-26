package ThinkTest01;

import java.util.Scanner;

public class ThinkTest013 {
	public static void main(String[] args) {
		
		int f1 =1;
		int f2 = 2;
		int f3 = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n == 1){
			f3 = 1;
		}else if(n == 2){
			f3 = 2;
		}else{
			for(int k =3;k<=n;k++){
			    f3 = f1 + f2;
				f1 = f2;
				f2 = f3;
			}
		}
		
		System.out.println("fn = "+ f3);

	}

}
