package Oops;

public class Developer extends Employee {
	
	double  Bonus;
@Override	
void work() {
	System.out.println("Name:"+name);
	System.out.println("Role:"+"Developer");
	System.out.println("Developer is writing Java code");
	System.out.println("Bonus:"+Bonus);
	
}
public Developer(String name, String  id, double Salary) {
	super(name, id, Salary);
	// TODO Auto-generated constructor stub
}




//Developer(String name,int Salary,)
double calculateBonus(double Salary) {
	Bonus=Salary*0.30;
	return Bonus;
	
}

}
