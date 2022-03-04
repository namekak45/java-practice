/* supawit itthisiriwet 
 * 6209650370
 */
package homework1;

public class HourlyEmployee extends Employee{
	private int workingSessionsPerMonth=8;
	private final int minHourWage=50;
	private int salary;
	private int workSessions,bonus;
	
	public HourlyEmployee(String FullName, int a,String d,int ws,int p) {
		super(FullName, a, p, d);
		 String[] splitName = FullName.split("-");
		 setFirstName(splitName[0]);
		 getFirstName();
		 setLastName(splitName[1]);
		 getLastName();
		 setFullName(FullName);
		 getFullName();
		 setAge(a);
		 this.workSessions=ws;
		 setPerformanceScore(p);
		 getPerformanceScore();
		 setDepartment(d);
		 getDepartment();
		 
		 calculatePersonalHourlyWage();
	}
	public void calculatePersonalHourlyWage() {
		if(getPerformanceScore()<=5) {
			salary = workSessions*minHourWage*workingSessionsPerMonth;
		} else if (getPerformanceScore()==6) {
			bonus = minHourWage*10/100; 
			salary = workSessions*(minHourWage+bonus)*workingSessionsPerMonth;
		} else if (getPerformanceScore()==7) {
			bonus = minHourWage*20/100; 
			salary = workSessions*(minHourWage+bonus)*workingSessionsPerMonth;
		} else if (getPerformanceScore()==8) {
			bonus = minHourWage*30/100; 
			salary = workSessions*(minHourWage+bonus)*workingSessionsPerMonth;
		} else if (getPerformanceScore()==9) {
			bonus = minHourWage*40/100; 
			salary = workSessions*(minHourWage+bonus)*workingSessionsPerMonth;
		} else if (getPerformanceScore()==10) {
			bonus = minHourWage*50/100; 
			salary = workSessions*(minHourWage+bonus)*workingSessionsPerMonth;
		} 
		
		
	}
	
	public int getMonthlyPayment() {
		return salary;
		
	}

	
}
