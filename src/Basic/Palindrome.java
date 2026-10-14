package Basic;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int b=s.nextInt();
		int t=b;
		int r=0;
		while(b!=0) {
			int a=b%10;
			r=r*10+a;
			b=b/10;
			
		}
		if(t==r) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		
	}

}
