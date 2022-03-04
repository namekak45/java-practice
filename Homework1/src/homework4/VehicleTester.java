//Supawit itthisiriwet
//6209650370
package homework4;

import java.util.Scanner;

public class VehicleTester {
	final static double km = 100.0;
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Vehicle veh = new Vehicle ();
		System.out.printf("Enter your car's distance(km)/year\n");
		veh.setDistance(scan.nextDouble());
		System.out.printf("Enter your car's efficiency (km/liter)\n");
		veh.setEffi(scan.nextDouble());
		veh.getConsumptionPerYear();
		veh.getConsumption(km);
		veh.getCO2EmissionPerKm();
		veh.getCO2Emission();
		veh.printInfo();
		scan.close();
	}

}
