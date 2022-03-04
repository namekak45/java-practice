/* supawit itthisiriwet 
 * 6209650370
 */

package homework1;

import java.util.ArrayList;

public class EmployeeInheritanceTest {
	public static ArrayList<PermanentEmployee> Pemp = new ArrayList<PermanentEmployee>();
	public static ArrayList<HourlyEmployee> Hemp = new ArrayList<HourlyEmployee>();
	public static void main(String[] args) {
		Pemp.add(new PermanentEmployee("Somchai-Hankla",25,8,"IT",20000));
		Pemp.add(new PermanentEmployee("Somsong-Bunthum",22,4, "IT",12000));
		Hemp.add(new HourlyEmployee("Manee-Dumkum",21, "Production",25,6));
		Hemp.add(new HourlyEmployee("Piti-Rukthai",25, "Production",30,5));
		Hemp.add(new HourlyEmployee("Veera-Rukdee",30, "Production",20,8));
		printMonthlyPayment();
}
	public static void printMonthlyPayment() {
		for(Employee a  : Pemp) {
			System.out.printf("*************************************************\n");
			System.out.printf("\tPAYMENT OF %s \n",a.getFullName());
			System.out.printf("*************************************************\n");
			System.out.printf("First Name: %s\t",a.getFirstName());
			System.out.printf("Last Name: %s\n",a.getLastName());
			System.out.printf("Department: %s\t",a.getDepartment());
			System.out.printf("Age: %d\n",a.getAge());
			System.out.printf("Monthly Payment : %d baht\t",a.getMonthlyPayment());
			System.out.printf("Social Security: %.2f\n",PermanentEmployee.socialSecurityRemittance);
			System.out.println();
		}
		for(Employee a  : Hemp) {
			System.out.printf("*************************************************\n");
			System.out.printf("\tPAYMENT OF %s \n",a.getFullName());
			System.out.printf("*************************************************\n");
			System.out.printf("First Name: %s\t",a.getFirstName());
			System.out.printf("Last Name: %s\n",a.getLastName());
			System.out.printf("Department: %s\t",a.getDepartment());
			System.out.printf("Age: %d\n",a.getAge());
			System.out.printf("Monthly Payment : %d baht\n",a.getMonthlyPayment());
			System.out.println();
		
		}

	}
}