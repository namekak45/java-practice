//supawit itthisiriwet
//6209650370
package homework4;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class ItemReport2 {
	private String header;
	private CopyOnWriteArrayList<ListableItem> listitems = new CopyOnWriteArrayList<ListableItem>();
	public ItemReport2 (String header) {
		
		this.header=header;
		}
	public void addAllItems(ArrayList<ListableItem> items) {
		listitems.addAll(items);
	}
	public void addItems(ListableItem item) {
		listitems.add(item);
	}
	public void itemUnder(float price) {
		System.out.printf("----------Item under %.2f----------\n",price);
			for(ListableItem item : listitems) {
			if(item.getCount()<price) {
				System.out.printf("%s\n",item.getMessage());
			}
											}
										}
	public void printList() {
		int ttc = 0;
		float ttp = 0;
		System.out.printf("----------%s----------\n",header);
		for(ListableItem item : listitems) {
			System.out.printf("%s\n",item.getMessage());
			ttc+=item.getCount();
			ttp+=item.getTotalPrice();
		}
		System.out.printf("Total Item : %d\n",listitems.size());
		System.out.printf("Total Unit Count :%d\n",ttc);
		System.out.printf("You need to pay %d baht\n",(int)ttp);
	}
}
