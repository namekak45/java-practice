//supawit itthisiriwet
//6209650370
package homework3;

public class ShoppingItem {
	private String name;
	private float pricePerUnit;
	private int count;

	public ShoppingItem(String iteminfo) {
		String[] iteminf = iteminfo.split(";");
		 name = iteminf[0];
		 pricePerUnit = Float.parseFloat(iteminf[1]);
		 count = Integer.parseInt(iteminf[2]);
	}
	public float getTotalPrice() {
		float totalPrice = (this.pricePerUnit)*(this.count);
		return totalPrice;
	}
	public String getName() {
		
		return name;
	}
	public float getPricePerUnit() {
		
		return pricePerUnit;
	}
	public int getCount() {
		
		return count;
	}
	public String getMessage() {
		return " Name:"+ name + "\t" + " price: " +pricePerUnit + "\t" + " count:" +  count + " items";
		
	}
}
