//6209650370
//Supawit itthisiriwet
package homework1;

import java.util.Random;

public class NewAccount {
	public String firstName,lastName;
	public long  accountNumber;
	
	
	Random rand = new Random();
	
	public void setFirstName (String a){
		firstName = a;
		}
	public void setLastName (String b) {
		lastName = b;
		}
	public String getFirstName() { 
		return firstName;
		}
	public String getLastName() { 
		return lastName;
		}
	public long generateNumber()
	{
		accountNumber = (long)(Math.random()*10000000000L);
	  return accountNumber;
	}

}
