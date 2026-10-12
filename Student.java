package Oops;

public class Student {
	String name;
	int roll_number;
	double marks;
	//Constructor
	Student(String name,int roll_number,double marks){
		this.name=name;
		this.roll_number=roll_number;
		this.marks=marks;
	}
	 
	public void displayDetails() {
		System.out.println("Name:" +name);
		System.out.println("roll_number :"+roll_number);
		System.out.println("marks: "+ marks);
		
	}
	public static void main(String[] args) {
		Student s=new Student("krishna",103,56);
//		s.name="Hari";
//		s.roll_number=102;
//		s.marks=98;
		s.displayDetails();
		}

}
