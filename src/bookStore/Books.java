package bookStore;

public class Books {

	String title;
	String author;
	double price;
	
	public Books() {
		System.out.println("Default Constructor");
	}

	public Books(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
}
