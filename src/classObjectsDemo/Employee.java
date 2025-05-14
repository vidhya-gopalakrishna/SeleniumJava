package classObjectsDemo;

public class Employee {
	
	int empID;
	String empName;
	String dept;
	
	public Employee() {
		
		System.out.println("In Constructor");
	}
	
	public Employee(int id, String name) {
		empID = id;
		empName = name;
	}

}
