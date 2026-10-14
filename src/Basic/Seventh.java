package Basic;

import java.util.Scanner;

public class Seventh {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=s.nextInt();
		int f=1;
		for(int i=1;i<=a;i++) {
			f=f*i;
			
			
		}
		System.out.println(f);
	}
	

}
