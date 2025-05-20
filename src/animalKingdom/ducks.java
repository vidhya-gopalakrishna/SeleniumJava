package animalKingdom;

public class ducks extends animal implements flyable,swimmable {

	public void swim() {
		System.out.println("Ducks can swim");
	}

	public void fly() {
		System.out.println("Ducks can fly");
		
	}

	public void makeSound() {
		System.out.println("Ducks can make sound");	
	}

}
