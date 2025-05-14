package loops;

import java.util.Scanner;


public class Vidhya511Loops {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		byte day;
		byte month;
		
		System.out.println("Please Enter the number to represent the day of the week");
		day = input.nextByte();
		
		switch(day)
		{
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Please enter values between 1 and 7");
			break;
		}
		System.out.println("Please Enter the number to represent the month ");
		month = input.nextByte();
		switch(month) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		default:
			System.out.println("Please enter value between 1 and 12");
		
		}

		System.out.println("Printing 9 tables in reverse");
		//for loop - write a table of 9 in reverse order
				for (int i=10;i>=1;i--) {
					System.out.println(i +" times 9 is "+i*9);
				} 
		
		System.out.println("Printing The Even Numbers");	
		int num = 2;
		while (num<=50) {
			System.out.println(num);
			num = num+2;
		}
		input.close();
	}

}
