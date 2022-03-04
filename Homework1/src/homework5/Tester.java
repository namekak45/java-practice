//Supawit itthisiriwet
//6209650370
package homework5;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Box b = new Box();
		SlopeFloor sf = new SlopeFloor();
		System.out.printf("Enter box weight: ");
		b.setWeight(scan.nextDouble());
		System.out.printf("Enter slope (Degree): ");
		sf.setRadius(scan.nextDouble());
		System.out.printf("Enter friction: ");
		sf.setFric(scan.nextDouble());
		System.out.printf("You need %.11f newtons of force to push the box up the ramp",sf.getMinForce(b, sf.reFric()));
		scan.close();

	}

}
