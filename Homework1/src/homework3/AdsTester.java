//Supawit itthisiriwet
//6209650370
package homework3;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class AdsTester {

	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	GregorianCalendar gcal = new GregorianCalendar();
	Ads ad = new Ads(); 
	System.out.printf("Enter your name\n");
		ad.setName(scan.nextLine());
	System.out.printf("Enter your Message\n");
		ad.setMes1(scan.nextLine());
	System.out.printf("Enter Tag\n");
		ad.setTag(scan.nextLine());
	System.out.printf("Enter more message\n");
		ad.setMes2(scan.nextLine());
	System.out.printf("Enter last message\n");
		ad.setMes3(scan.nextLine());
		ad.displayAd();//Result
		System.out.printf("%td %<tB %<tY,%<tT %<Tp%n",gcal );
	scan.close();

	}

}
	