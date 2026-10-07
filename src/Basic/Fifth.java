package Basic;

import java.util.Scanner;

public class Fifth {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int b=s.nextInt();
		int sum=0;
		for(int i=1;i<=b;i++) {
			sum=sum+i;
			
		}
		System.out.println(sum);
	}

}
