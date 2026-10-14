package Oops;

public class Employee {
	String name;
	String id;
	double Salary;
	void work() {
		System.out.println("Name:"+name);
		System.out.println("Role:"+"Employee");
		System.out.println("Employee is writing Java code");
//		System.out.println("Bonus:"+Bonus);
	}
	  public Employee(String name, String id, double Salary) {
	        this.name = name;
	        this.id = id;
	        this.Salary = Salary;
	    }
	double calculateBonus(double Salary) {
	 return Salary*0.20;	
	}

}
