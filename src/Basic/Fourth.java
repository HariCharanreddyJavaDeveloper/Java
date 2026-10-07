package Basic;

import java.util.Scanner;

public class Fourth {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int a=s.nextInt();
		for(int i=0;i<=a;i++) {
			if(i%2!=0) {
			System.out.println(i);
		}
		}
	}
}
	
