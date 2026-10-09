package Basic;

import java.util.Scanner;

public class Eight {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=s.nextInt();
		int r=0;
		
		while(a!=0) {
			int b=a%10;
			r=r*10+b;
			a=a/10;
		}
		System.out.println(r);
	}

}
