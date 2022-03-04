//supawit itthisiriwet
//6209650370
package homework3;

import java.util.ArrayList;
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
	public void addItems(ShoppingItem item) {
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
}
