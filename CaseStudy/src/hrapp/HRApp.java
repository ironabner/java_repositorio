package hrapp;

public class HRApp {

	public static void main(String[] args) {
		System.out.println("HRapp Starts");
		
		Employee e1 = new Employee(1,"Ignacio",50000);
		Employee e2 = new Employee(2,"Miriam",63201);
		
	
		
		Department dept = new Department("Educacion");
		
		dept.addEmp(e1);
		dept.addEmp(e2);
		dept.addEmp(new Employee(3,"Carlos",51520));
		
		Employee[] emps =dept.getEmployees();
		
		for (Employee emp:emps) {
			System.out.println("Emp " + emp);			
		}

		System.out.println("Total " + dept.getTotalSalary());
		System.out.println("Total " + dept.getAverageSalary());
		
		
		System.out.println("EMP " + dept.getEmployeeByID(4))
		;
	}
}
