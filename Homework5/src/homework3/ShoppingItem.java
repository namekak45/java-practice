//supawit itthisiriwet 
//6209650370
package homework3;

public class ShoppingItem {
	private String name;
	private float pricePerUnit;
	private int count;

	public ShoppingItem(String iteminfo) throws InvalidDataException {
		String[] iteminf = iteminfo.split(";");
		if(iteminf.length!=3) {
			throw new InvalidDataException ("Data incomplete:"+iteminf);
		} 
		
		 name = iteminf[0].trim();
		 pricePerUnit = Float.valueOf(iteminf[1].trim());
		 count = Integer.valueOf(iteminf[2].trim());
		 
		
		 
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
