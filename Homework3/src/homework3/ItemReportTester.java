//supawit itthisiriwet
//6209650370
package homework3;

import java.util.Scanner;

public class ItemReportTester {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("What is the name of this shopping list\n");
		ItemReport item = new ItemReport(scan.nextLine());
		 
	while(true) {
			System.out.printf("Add more items (name;price per unit;count) or exit (e) \n");
			String addItem= scan.nextLine();
			
			if(addItem.equalsIgnoreCase("e")) {
				break;
			}
			item.addItems(new ShoppingItem(addItem));
			
		}
		item.printList();
		item.itemUnder(20);
		scan.close();
		
	}
}

