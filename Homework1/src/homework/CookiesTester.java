//Supawit itthisiriwet
//6209650370
package homework;

public class CookiesTester {

	public static void main(String[] args) {
		Cookies cook1 = new Cookies ();
		Cookies cook2 = new Cookies ();
		Cookies cook3 = new Cookies ();
		Cookies cook4 = new Cookies ();
		
		cook1.setName("Chocolate Chip Cookie");
		cook1.setPrice(15);
			System.out.printf("Product :%s\n", cook1.getName());
			System.out.printf("Price :\t%.2f\n", cook1.getPrice());
		cook2.setName("Peanut Butter Cookie");
		cook2.setPrice(20);
			System.out.printf("Product :%s\n", cook2.getName());
			System.out.printf("Price :\t%.2f\n", cook2.getPrice());
		cook3.setName("Oatmeal Cookie");
		cook3.setPrice(25);
			System.out.printf("Product :%s\n", cook3.getName());
			System.out.printf("Price :\t%.2f\n", cook3.getPrice());
		cook4.setName("Oatmeal Resin Cookie");
		cook4.setPrice(27);
			System.out.printf("Product :%s\n", cook4.getName());
			System.out.printf("Price :\t%.2f\n", cook4.getPrice());
		
	}

}
