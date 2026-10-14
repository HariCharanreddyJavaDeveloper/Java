package Basic;
//1. Add two numbers

//Write a method that accepts two integers and returns their sum.
public class Eleventh {
	int sum(int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
		Eleventh s=new Eleventh();
		int r=s.sum(10,20);
		System.out.println(r);
		
	}

}
