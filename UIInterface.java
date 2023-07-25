package database;

import java.util.Scanner;

public class UIInterface {
	static void startApp() {
		Scanner s = new Scanner(System.in);
		System.out.println("****** Welcome To Itvedant Inventory ******");
		while(true) {
			System.out.println("Select the operation to perform:");
			System.out.println("1. Show All Product Details");
			System.out.println("2. Find Product By ID");
			System.out.println("3. Add More Products");
			System.out.println("4. Update Product Details");
			System.out.println("5. Delete Product Details");
			System.out.println("0. Quit");
			System.out.print("Enter Your Choice: ");
			int choice = s.nextInt();
			if(choice == 0) {
				System.out.println("************ Thank You ************");
				break;
			}
			else {
				switch(choice) {
					case 1: 
					case 2: 
					case 3: 
					case 4: 
					case 5: 
					default: System.out.println("\n\nEnter the correct choice\n\n"); 
				}
			}
		}
	}
}
