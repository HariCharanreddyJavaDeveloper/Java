package Oops;

public class Tester extends Employee {
	
	
	double Bonus;
	@Override
	void work() {
		System.out.println("Name:"+name);
		System.out.println("Role:"+"Tester");
		System.out.println("Tester is testing Java code");
		System.out.println("Bonus:"+Bonus);
		
	}
	public Tester(String name, String id, double Salary) {
		super(name, id, Salary);
		// TODO Auto-generated constructor stub
	}
	double calculateBonus(double Salary) {
		Bonus=Salary*0.40;
		return Bonus;
		
	}
	
}
