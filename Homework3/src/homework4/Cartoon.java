//supawit itthisiriwet
//6209650370
package homework4;

public class Cartoon implements ListableItem{
	private String name;
	private int dayRented,volumeNo;
	private float price;
	public Cartoon(String name, int volumeNo,int dayRented,float price) {
		this.name = name;
		this.dayRented = dayRented;
		this.price = price;
		this.volumeNo = volumeNo;
	}
	public String getName() {
		return name;
	}
	public int getDayRented() {
		return dayRented;
	}
	public int getVolumeNo() {
		return volumeNo;
	}
	public float getPrice() {
		return price;
	}
	
	public String getMessage() {
		
		return ""+ name + "\t" + "vol"+getVolumeNo()  + "\t"+ "price per day:" +(int)(price/10)+ "\t"+ "\t"  +"rented for:"+ dayRented +"days";
	}
	
	public int getCount() {
		
		return dayRented;
	}
	
	public float getTotalPrice() {
		
		return (int)(price/10)*dayRented;
	}
}
