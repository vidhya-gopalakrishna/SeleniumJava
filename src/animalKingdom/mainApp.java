package animalKingdom;

import encapsulationDemo.methodDemo;

public class mainApp extends methodDemo{

	public static void main(String[] args) {
		eagles e = new eagles();
		ducks d = new ducks();
		dolphins dlp = new dolphins();
		
		e.fly();
		e.makeSound();
		
		d.fly();
		d.swim();
		d.makeSound();
		
		dlp.swim();
		dlp.makeSound();
		
		methodDemo md = new methodDemo();
		System.out.println("Public Method From Diff Package");
		md.publicDemo();
		
		mainApp ma = new mainApp();
		System.out.println("Access Protected Method from different package");
		ma.protectDemo();
		
	}

}
