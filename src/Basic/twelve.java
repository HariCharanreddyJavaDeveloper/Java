package Basic;

public class twelve {
	int even(int a) {
		if(a%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		return a;
	}
	
	
	public static void main(String [] args) {
		twelve d=new twelve();
		int s = d.even(10);

		
		
	}

}
