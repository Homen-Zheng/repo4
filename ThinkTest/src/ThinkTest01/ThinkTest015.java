package ThinkTest01;

import java.util.Scanner;
public class ThinkTest015 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = i;
		int sum = 0;
		while(j !=0){
			sum = sum*10+j%10;
			j/=10;
		}
		
		if(i == sum){
			System.out.println(true);
		}else{
			System.out.println(false);
		}
		
	}

}
