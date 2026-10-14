package Oops;

public class Main {
	public static void main(String[] args) {
		Employee e=new Developer("Krish", "Developer", 200);
		e.calculateBonus(200);
		e.work();
//	d.CalculateBonus(200);
		Tester t=new Tester("ram","Tester",150);
		t.calculateBonus(150);
		t.work();
//		d.CalculateBonus(89);
	}

}
