package bookStore;

public class BookStore {
	public static void main(String[] args) {
		
		display();
		
	}

	public static void display() {
		Books b1= new Books();
		Books b2= new Books("HarryPotter","JKRowling",50.00);
		System.out.println("The Title of the book is "+b2.title);	
		System.out.println("The author of the book is "+b2.author);
		System.out.println("The price of the book is "+b2.price);
		
	}

}
