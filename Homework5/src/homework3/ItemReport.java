//supawit itthisiriwet 
//6209650370

package homework3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class ItemReport {
	private String header;
	private CopyOnWriteArrayList<ShoppingItem> shop = new CopyOnWriteArrayList<ShoppingItem>();
	public ItemReport (String header) {
		
		this.header=header;
		}
	public void addAllItems(ArrayList<ShoppingItem> items) {
		shop.addAll(items);
	}
	public void addItems(ShoppingItem item) throws InvalidDataException {
		shop.add(item);
	}
	public void itemUnder(float price) {
		System.out.printf("----------Item under %.2f----------\n",price);
			for(ShoppingItem item : shop) {
			if(item.getPricePerUnit()<price) {
				System.out.printf("%s\n",item.getMessage());
			}
											}
										}
	public void printList() {
		int ttc = 0;
		float ttp = 0;
		System.out.printf("----------%s----------\n",header);
		for(ShoppingItem item : shop) {
			System.out.printf("%s\n",item.getMessage());
			ttc+=item.getCount();
			ttp+=item.getTotalPrice();
		}
		System.out.printf("Total Item : %d\n",shop.size());
		System.out.printf("Total Unit Count :%d\n",ttc);
		System.out.printf("You need to pay %.2f baht\n",ttp);
	}
	public void loadReport(String fileName) throws InvalidDataException {
		try (Scanner scan = new Scanner (new File (fileName));){
			while(scan.hasNextLine()) {
				String head = scan.nextLine();
				String count = scan.nextLine();
			
			 	
				for(int i=0;i<Integer.valueOf(count.trim());i++) {
					String itemcounter = scan.nextLine();
					addItems(new ShoppingItem(itemcounter));
					
				}
				printList();
				
			}
			
		} catch (FileNotFoundException e) {
			System.out.printf("File not found");
		} catch (InvalidDataException e) {
			System.out.printf("Invalid data"+shop);
			
		} catch (NumberFormatException e) {
			throw new InvalidDataException("Invalid File Format"+shop);
			
		} catch (NoSuchElementException e) {
			throw new InvalidDataException("Invalid File Format"+shop);
		}
	}
	public void saveReport(String fileName) {
		try {
			File file = new File(fileName);
			PrintWriter pw = new PrintWriter(file);
			pw.println(""+header);
			pw.println(""+shop.size());
			for(ShoppingItem item : shop) {
				
				pw.printf("%s;%d;%d\n",item.getName(),(int)item.getPricePerUnit(),item.getCount());

			}
			pw.close();
			
		} catch (FileNotFoundException e) {
			System.out.printf("Error file not found");
		}
	}
}
