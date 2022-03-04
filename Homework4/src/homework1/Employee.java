/* supawit itthisiriwet 
 * 6209650370
 */
package homework1;

public abstract class  Employee {
	private String fullName,department,firstName,lastName;
	private int age,performanceScore;
	public void setFullName(String a) {
		fullName = a;
	}
	public String getFullName() {
		return fullName;
	}
	public void setDepartment(String b) {
		department = b;
	}
	public String getDepartment() {
		return department;
	}
	public void setAge(int a) {
		age = a;
	}
	public int getAge() {
		return age;
	}
	public void setPerformanceScore(int b) {
		performanceScore = b;
	}
	public int getPerformanceScore() {
		return performanceScore;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Employee(String FullName,int a,int p,String d){
		 String[] splitName = FullName.split("-");
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
	}
	public abstract int getMonthlyPayment();
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	} 
	
		
	
}
