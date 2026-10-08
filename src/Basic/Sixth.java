package Basic;

import java.util.Scanner;

public class 	Sixth {
	public static void main(String [] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter a number");
			int d=s.nextInt();
			for(int i=1;i<=10;i++) {
				System.out.println(d+"*"+i+"="+d*i);
			}
	}
	}