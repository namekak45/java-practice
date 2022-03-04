//supawit itthisiriwet 
//6209650370
package homework3;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ShoppingListProgram {
	public static void main(String[] args)  {
	try {
		printMenu();
	} catch (InvalidDataException e) {
		
		e.printStackTrace();
	}
		
	}

	private static void printMenu() throws InvalidDataException {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.printf("What is the name of this shopping list\n");
		ItemReport item = new ItemReport(scan.nextLine());
	try {	 
	while(true) {
			System.out.printf("Select what you want to do.\nAdd item (a),Print list(p),Load list(l),Save list(s), Exit(x)\n");
			String choice= scan.nextLine();
			
			if(choice.equalsIgnoreCase("x")) {
				System.exit(0);
			}else if(choice.equalsIgnoreCase("p")) {
				item.printList();
				
			}else if(choice.equalsIgnoreCase("a")) {
				System.out.printf("Please input data name;price;amount\n");
				String addItem = scan.nextLine();
				item.addItems(new ShoppingItem(addItem));
				System.out.printf("Finish!\n");
				
			}else if(choice.equalsIgnoreCase("l")) {
				System.out.printf("Please input file name to load\n");
				String fileName = scan.nextLine();
				item.loadReport(fileName);
				
			}else if(choice.equalsIgnoreCase("s")) {
				System.out.printf("Please input file name to save\n");
				String fileName = scan.nextLine();
				item.saveReport(fileName);
				System.out.printf("Finish!\n");
			}
			else if (!choice.equalsIgnoreCase("s")||!choice.equalsIgnoreCase("x")||!choice.equalsIgnoreCase("a")
					||!choice.equalsIgnoreCase("p")||!choice.equalsIgnoreCase("l")) {
				     System.out.printf("Wrong input, try again\n");
			}
			
			
		}
	} catch (InvalidDataException e) {
		throw new InvalidDataException("Invalid File data\n");
		
	} catch (NumberFormatException e) {
		throw new InvalidDataException("Invalid File Format\n");
		
	} catch (NoSuchElementException e) {
		throw new InvalidDataException("Invalid File Format\n");
	}

	}
}

