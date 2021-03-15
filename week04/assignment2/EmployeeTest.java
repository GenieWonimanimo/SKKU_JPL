class Employee {
	private String fName;
	private String lName;
	private double salary;
	
	public Employee(String fName, String lName, double salary) {
		this.fName = fName;
		this.lName = lName;
		this.setSalary(salary);
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if (salary > 0)
			this.salary = salary;
	}
	
	// this method raise employee's salary by 5%
	public void raiseSalary() {
		salary *= 1.05;
	}
	// this method print employee's info with given format
	public void printInfo() {
		System.out.println(getfName() + " " + getlName() + "'s salary: $" + getSalary());
	}
}


public class EmployeeTest {
	public static void main(String[] args) {
		Employee j = new Employee("John", "Ewing", 3000);
		Employee s = new Employee("Jack", "Sparrow", 100000);
		
		j.printInfo();
		s.printInfo();
		
		j.raiseSalary();
		s.raiseSalary();
		
		System.out.println("After raise by 5%");
		j.printInfo();
		s.printInfo();
	}
}
