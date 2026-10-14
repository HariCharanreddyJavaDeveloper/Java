package Basic;

import java.util.Scanner;

public class Ninth {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter  a number");
		int a=s.nextInt();
		int c=0;
		while(a!=0) {
			int b=a%10;
			a=a/10;
			c++;
		}
		System.out.println(c);
	}

}
