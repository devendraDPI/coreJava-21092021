package test;

public class Employee extends Person {
	
	public int EmpID;
	public int Salary;
	static String department = "Technology";
	
	public Employee() {
		
		System.out.println("Inside Emp Cons");
		
	}
	
	public Employee(int empID, int salary) {
		
		this(); // to call default constructor
		
		this.EmpID = empID;
		this.Salary = salary;
		
	}
	
	public Employee(String name, int age, String city,int empID, int salary) {
		
		super(name,age,city);
		
		this.EmpID = empID;
		this.Salary = salary;
		
	}
	
	public void display() {
		
		super.display();
		
		System.out.println("Emp. ID is " + EmpID);
		System.out.println("Salary is " + Salary);
		System.out.println("Dep. is " + Employee.department);
	}

}