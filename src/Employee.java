//Creating a class Employee
public class Employee {
 int empId;
 String empName;
 int TotalLeaves;
 double TotalSalary;
 //Creating the constructor of the Employee class
public Employee(int empId, String empName, int totalLeaves, double totalSalary) {
	super();
	this.empId = empId;
	this.empName = empName;
	TotalLeaves = totalLeaves;
	TotalSalary = totalSalary;
	}
//Creating the abstract method calculate_balanceLeaves
void  calculate_balanceLeaves(){
}
//Creating the abstract method avail_leave
boolean avail_leave(int no_of_leaves, char type_of_leave){
	return true;
}
//Creating the abstract method calculate_salary
void calculate_salary(){
	
}
}
//Creating a class PermanentEmp which is extending Employee class
class PermanentEmp extends Employee{
	
//Creating three variables
double basic,hra,pfa;
// constructor: it is from parent class
	public PermanentEmp(int empId, String empName, int totalLeaves, double totalSalary) {
		super(empId, empName, totalLeaves, totalSalary);
		
	}
	//initializing the variables
	int paid_leave=5,sick_leave=4,casual_leave=8;
	// Method to display leave details
	void print_leave_details() {
		//printline
		System.out.println("paid_leave" + paid_leave + "sick_leave" + sick_leave + "casual_leave" + casual_leave);
	}
	//overriding the calculate_balanceLeaves method
	@Override
	void calculate_balanceLeaves() {
		
		int balanceTotal=TotalLeaves-(paid_leave+sick_leave+casual_leave);
		System.out.println("Total leaves left= "+balanceTotal);
		}
	//overriding the avail_leave method
	@Override
	boolean avail_leave(int no_of_leaves, char type_of_leave) {
		if( no_of_leaves< TotalLeaves){
			return true;
		}else{
			return false;
		}
		
	}
	//Overriding the calculate_salary method
	@Override
	void calculate_salary() {
		double hra=0.5f* basic;
		double da= .2f * basic;
		double totalSalary = TotalSalary + (hra + da) - pfa;
		System.out.println("Salary of the employee is = "+ totalSalary);
	}
	
}
//Creating a class TemporaryEmp which is extending Employee class
class TemporaryEmp extends Employee{
	//Creating three variables
	double basic,hra,pfa;
	//Creating the constructor of the Employee class
	public TemporaryEmp(int empId, String empName, int totalLeaves, double totalSalary) {
		super(empId, empName, totalLeaves, totalSalary);
		
	}
	//initializing the variables
	int paid_leave=5,sick_leave=4,casual_leave=8;
	// Method to display leave details
	void print_leave_details() {
		System.out.println("paid_leave" + paid_leave + "sick_leave" + sick_leave + "casual_leave" + casual_leave);
	
	}
	//overriding the calculate_balanceLeaves method
	@Override
	void calculate_balanceLeaves() {
		
		int balanceTotal=TotalLeaves-(paid_leave+sick_leave+casual_leave);
		System.out.println("Total leaves left= "+balanceTotal);
		}
	//Overriding the calculate_salary method
	@Override
	boolean avail_leave(int no_of_leaves, char type_of_leave) {
		if( no_of_leaves< TotalLeaves){
			return true;
		}else{
			return false;
		}
		
		}
	
	@Override
	//Overriding the calculate_salary method
	void calculate_salary() {
		double hra=0.5f* basic;
		double da= .2f * basic;
		double totalSalary = TotalSalary + (hra + da) - pfa;
		System.out.println("Salary of the employee is = "+ totalSalary);
	}
}

