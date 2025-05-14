package classObjectsDemo;

public class App {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee(8, "Venki");
		
		System.out.println(e1.empID);
		System.out.println(e2.empName);
		System.out.println(e2.empID);
	}
	
}
