/**
 * Creating a class EmployeeDemo
 * @author Pri
 *
 */
public class EmployeeDemo {
// Main method 
	public static void main(String[] args) {
		//Creating object of the permanentEmp and passing the arguments
		PermanentEmp pe= new PermanentEmp(0012,"Ram",17,30000.00);
		System.out.println("permanent employee detail");
		/* calling id,name,no of TotalLeaves */
		System.out.println("Id  =" + pe.empId);
		System.out.println("name =" + pe.empName);
		System.out.println("leave =" + pe.TotalLeaves);
		/* calling the method */
		pe.calculate_balanceLeaves();
		pe.avail_leave(17, (char)0);
		pe.calculate_salary();
		System.out.println("..................................");

		//Creating object of the permanentEmp and passing the arguments
		TemporaryEmp te= new TemporaryEmp(5643,"Neha",17,25000.00);
		System.out.println("Temprory employee detail");
		/* calling id,name,no of TotalLeaves */
		System.out.println("Id  =" + te.empId);
		System.out.println("name =" + te.empName);
		System.out.println("leave =" + te.TotalLeaves);
		/* calling the method */
		te.calculate_balanceLeaves();
		te.avail_leave(17, (char)0);
		te.calculate_salary();

	}

}
