package _07_oop;

class Department {
	
	private String nameOfDepartment;
	private int numberOfEmployees;
	
	public Department(String nameOfDepartment, int numberOfEmployees) {
		   this.nameOfDepartment = nameOfDepartment;
		   this.numberOfEmployees = numberOfEmployees;

	}
		   
		 public void DepartmentInfo() {
			 System.out.println("Name of Department: " + nameOfDepartment);
			 System.out.println("Number of employees: " + numberOfEmployees);
		 
	}
}