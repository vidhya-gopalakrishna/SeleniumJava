package encapsulationDemo;

public class methodDemo {
	
	void defaultDemo() {
		System.out.println("Default Method");
	}
	
	protected void protectDemo() {
		System.out.println("Protected Method");
	}
	
	public void publicDemo() {
		System.out.println("Public Method");
	}
	
	@SuppressWarnings("unused")
	private void privateDemo() {
		System.out.println("Private Method");
	}

}
