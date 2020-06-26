package StringTest;

import java.util.Scanner;
public class sanjiaoxing {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();
		
		if(i < j){
			int temp = i;
			i = j;
			j = temp;
		}
		if(i<k){
			int temp = i;
			i = k;
			k = temp;
		}
		
		if(i*i == j*j + k*k  && i<j+k){
			System.out.println("直角三角形");
		}else if(i*i > j*j + k*k && i<j+k){
			System.out.println("钝角三角形");
		}else if(i*i < j*j + k*k && i<j+k){
			System.out.println("锐角三角形");
		}else{
			System.out.println("不构成三角型");
		}
	}

}
