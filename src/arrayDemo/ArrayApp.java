package arrayDemo;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayApp {

	public static void main(String[] args) {
	int arr[] = {1,2,3,4,5,6,7,8,9,10};
	System.out.println("Enter the number to search ");
	int counter = 0;
	
	Scanner input = new Scanner(System.in);
	int b = input.nextByte();
	
	for (int i=0; i<arr.length; i++){
		if (b==arr[i]) {
			counter = counter+1;
			
		}	
		
	}
	if (counter>0) {
		System.out.println("The entered number is found in the array");
	}
	else
	{
		System.out.println("The entered number is not found in the array");
	}
	System.out.println("Names in Arraylist");
	ArrayList<String> names = new ArrayList<String>();
	names.add("Virat");
	names.add("Ankit");
	names.add("Chandra");
	Collections.sort(names);  // Sort cars
    for (String i : names) {
      System.out.println(i);
    }
	
	}

}
