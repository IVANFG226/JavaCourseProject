/* Online Ordering Program */
/* Ivan Garcia */

import java.util.Scanner;

class Food { // array of strings

	String price[] = {"1.Cheeseburger: $3.50", "2.Hamburger: $3.00", "3.Double Cheeseburger: $4.00", "4.French Fries: $1.50"
				, "5.Beverages: $1.00", "6.Shakes: $2.00"}; // array of options on menu
	
	public void Cheeseburger() {
		System.out.println(price[0]); // printing out from array
	}
	public void Hamburger() {
		System.out.println(price[1]); // printing out from array
	}
	public void dblCheeseburger() {
		System.out.println(price[2]); // printing out from array
	}
	public void Fries() {
		System.out.println(price[3]); // printing out from array
	}
	public void Beverages() {
		System.out.println(price[4]); // printing out from array
	}
	public void Shakes() {
		System.out.println(price[5]); // printing out from array
	}
}

class Beverage {
	public void Cola() {
		System.out.println("Cola was added to bag"); // print for cola being added
		
	}
	public void Sprite() {
		System.out.println("Sprite was added to bag"); // print for sprite being added
		
	}
	public void Lemonade() {
		System.out.println("Lemonade was added to bag"); // print for lemonade being added
		
	}
}
class Shakes {
	public void Chocolate() {
		System.out.println("Chocolate Shake was added to bag"); // print for chocolate shake being added
		
	}
	public void Vanilla() {
		System.out.println("Vanilla Shake was added to bag"); // print for vanilla shake being added
		
	}
	public void Strawberry() {
		System.out.println("Strawberry Shake was added to bag"); // print for strawberry shake being added
		
	}
}


public class OnlineOrdering extends Food { // MAIN
	
	public static void main(String[] args) throws java.io.IOException {

		
	
		Scanner scan = new Scanner(System.in); 

		Food f = new Food(); // food object
		Beverage b = new Beverage(); // beverage object
		Shakes s = new Shakes(); // shake object

		int option; // variable for switch
		double total; // variable for total sum
		total = 0; // intializer

		System.out.println("Welcome to our restaurant!"); // welcome 
		System.out.print("Enter your street address: ");
		String address = scan.nextLine(); // gather address from user
		
	do { // do while loop for menu
		
		
		System.out.println();
		System.out.println("What would you like to order?");
		System.out.println();
		System.out.println("Menu");
		f.Cheeseburger();
		f.Hamburger();
		f.dblCheeseburger();
		f.Fries();	
		System.out.println("5.Coca-Cola: Beverages $1.00");
		System.out.println("6.Sprite");
		System.out.println("7.Lemonade");
		System.out.println("8.Chocolate Shake: Shakes $2.00");
		System.out.println("9.Vanilla Shake");
		System.out.println("10.Strawberry Shake");
		System.out.println("11.Check Total");
		System.out.println("12.Proceed to Checkout.");
		System.out.println("13.Exit");
		
		option = scan.nextInt(); // gather user choice.
	
		switch(option) { // switch statement to navigate menu.
			case 1:
				System.out.println("Cheeseburger added to bag");
				total += 3.50;
				break;
			case 2:
				System.out.println("Hamburger added to bag");
				total += 3.00;
				break;
			case 3:
				System.out.println("Double Cheesburger added to bag");
				total += 4.00;
				break;
			case 4:
				System.out.println("French Fries added to bag");
				total += 1.50;
				break;
			case 5:
				b.Cola();
				total += 1.00;
				break;
			case 6:
				b.Sprite();
				total += 1.00;
				break;
			case 7:
				b.Lemonade();
				total += 1.00;
				break;
			case 8:
				s.Chocolate();
				total += 2.00;
				break;
			case 9:
				s.Vanilla();
				total += 2.00;
				break;
			case 10:
				s.Strawberry();
				total += 2.00;
				break;
			case 11:
				System.out.println("Your total is: " + total);
				break;
			case 12: // Summary of order
				System.out.println("Your total is: $" + total + " and will be delivered to: " + address + " in 30 minutes.");
				System.out.println("Exiting Program..."); // End of program
				System.exit(0);
				break;
			case 13:
				System.out.println("Exiting Program..."); // End of program
				System.exit(0);
				break;
	
		} 
		}while (option != 13); // loop back to beginning.

	

		
		

	
	
	}
}