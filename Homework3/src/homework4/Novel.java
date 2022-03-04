//supawit itthisiriwet
//6209650370
package homework4;

public class Novel implements ListableItem{
	private String name;
	private int dayRented;
	public Novel(String name, int dayRented) {
		this.name = name;
		this.dayRented = dayRented;
	}
	public String getName() {
		return name;
	}
	public int getDayRented() {
		return dayRented;
	}
	
	public String getMessage() {
		
		return ""+ name + "\t" + "price per day: 7"  + "\t" + "rented for:" +dayRented+ "days" ;
	}
	
	public int getCount() {
		
		return getDayRented();
	}
	
	public float getTotalPrice() {
		
		return dayRented*7;
	}
}
