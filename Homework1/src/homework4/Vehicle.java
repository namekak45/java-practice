//Supawit itthisiriwet
//6209650370
package homework4;

public class Vehicle {	
	
	private double efficiency,conPerYear,co2PerKm,co2Emis,distance,range;
		public void setDistance (double aDistance) {
		distance = aDistance;
		}
	public double getDistance () {
	return distance;
		}
	public void setConPerYear (double aConPerYear) {
		conPerYear = aConPerYear;
		}
	public void setEffi (double aEfficiency) {
		efficiency = aEfficiency;
		}
	public double getEffi () {
		return efficiency;
		}
	public double getConsumption (double aRange) {
		range = aRange/efficiency;
		return range;
		}
	public void getConsumptionPerYear() {
		conPerYear = distance/efficiency ;
		} 
	public void getCO2EmissionPerKm () {
		co2PerKm = 2392.5 / efficiency;
		}
	public double getCO2Emission() {
		co2Emis = co2PerKm * distance / 1000000;
		return co2Emis;
		}
	public void printInfo () {
		System.out.printf("Your car's profile :\n");
		System.out.printf("\tEfficiency (km/l) :%.2f\n",getEffi());
		System.out.printf("\tDistance (km/year): %.1f\n",getDistance());
		System.out.printf("\tConsumption of 100km (liter): %.1f\n",range);
		System.out.printf("\tConsumption per year (liter): %.1f\n",conPerYear);
		System.out.printf("\tCO2 emission (g/km) : %.1f\n", co2PerKm);
		System.out.printf("\tCO2 emission per year (tons) : %.3f", co2Emis);
		
		} 

}
