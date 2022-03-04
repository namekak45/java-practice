//supawit itthisiriwet 
//6209650370
package homework2;

import java.util.Arrays;

public class StockItem {
	private String name;
	private int amount;
	public String  getName() {
		return name;
	}
	public int getAmount() {
		return amount;
	}
	
	public StockItem(String detailItem) throws InvalidDataException {
		String detail[] = detailItem.split(";");
		
		if (detail.length!=2){
			throw new InvalidDataException ("Incomplete Data:"+ ""+Arrays.asList(detail));
			
		}
		
		name = detail[0];
		amount = Integer.valueOf(detail[1]);
		getName();
		getAmount();
		} 
		
	}


