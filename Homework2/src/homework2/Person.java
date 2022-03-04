//6209650370
//Supawit itthisiriwet
package homework2;


import java.util.Scanner;

public class Person {
	Scanner scan = new Scanner (System.in);
	private String name,lastName;
	private int birthD,birthM,birthY,age;
	
	
	
	public void setName(String fn) {
		name = fn;
		
	}
	public String getName() {
		return name;
	}
	public void setLastName(String ln) {
		lastName = ln;
	}
	public String getLastName() {
		return lastName;
	}
	/*public String getBirthDayBE() {
	
	}*/
	public int getBirthDay() {
		
		return birthD;
	}
	public int getBirthMonth() {
		
		return birthM;
	}
	public int getBirthYear() {
		
		return birthY;
	}
	public void setBirthDay(int bd) {
		birthD =bd;
	}
	public void setBirthMonth(int bm) {
		birthM =bm;
	}
	public void setBirthYear(int by) {
		birthY =by;
	}
	public int getAge() {
		age = 2020-birthY;
		return  age;
	}
	
	/*public int test() {
		return sumL;
	}*/
}
