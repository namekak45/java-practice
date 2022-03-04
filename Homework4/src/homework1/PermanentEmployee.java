/* supawit itthisiriwet 
 * 6209650370
 */
package homework1;

public class PermanentEmployee extends Employee{
	private int salary;
	private int bonus;
	public static float socialSecurityRemittance;
	public PermanentEmployee(String FullName, int a, int p, String d,int salary) {
		super(FullName, a, p, d);
		String[] splitName = FullName.split("-");
		 
		 setSalary(salary);
		 getSalary();
		 setFirstName(splitName[0]);
		 getFirstName();
		 setLastName(splitName[1]);
		 getLastName();
		 setFullName(FullName);
		 getFullName();
		 setAge(a);
		 setPerformanceScore(p);
		 getPerformanceScore();
		 setDepartment(d);
		 getDepartment();
		 getMonthlyPayment();
	}

	
	public int getMonthlyPayment() {
		
		socialSecurityRemittance = ((salary*5)/100);
		if(socialSecurityRemittance>750) {
			socialSecurityRemittance=750;
		} 
		
		if(getPerformanceScore()>=8) {
			
			bonus  = (salary*3)/100 ;
			salary +=bonus;
			
		}  
			return  (int) (salary-socialSecurityRemittance);
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public int getSalary() {
		return salary;
	}
	
	

}
