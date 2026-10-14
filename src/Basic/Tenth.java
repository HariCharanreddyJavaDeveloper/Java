package Basic;

import java.util.Scanner;

public class Tenth {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter  a number");
		int a=s.nextInt();
		
		int c=0;
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				c++;
			}	
		}
		if(c==2) {
			System.out.println("prime");
		}
	  else {
         System.out.println("not prime"); 
     }
	}

}
