//6209650370
//Supawit itthisiriwet

package homework2;

import java.util.Scanner;

public class LoveTester {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Person per1 = new Person();
		Person per2 = new Person();
		Zodiac zo1 = new Zodiac();
		Zodiac zo2 = new Zodiac();
		LetterFinder let = new LetterFinder();
		System.out.printf("Enter your name and birthdate in format:Name Lastname;dd/mm/yyyy\n");
		per1.setName(scan.next());
		per1.setLastName(scan.next());
		per1.setBirthDay(scan.nextInt());
		per1.setBirthMonth(scan.nextInt());
		per1.setBirthYear(scan.nextInt());
		let.countingL(per1.getName(),per1.getLastName());
		let.countingO(per1.getName(),per1.getLastName());
		let.countingV(per1.getName(),per1.getLastName());
		let.countingE(per1.getName(),per1.getLastName());
		let.countingS(per1.getName(),per1.getLastName());
		per1.getAge();
		System.out.printf("%s %s %d/%d/%d\n",per1.getName(),per1.getLastName(),per1.getBirthDay(),per1.getBirthMonth(),per1.getBirthYear());
		while (true) {
		System.out.printf("Enter name and birthdate of your lover in format:Name Lastname;dd/mm/yyyy\n");
		per2.setName(scan.next());
		per2.setLastName(scan.next());
		per2.setBirthDay(scan.nextInt());
		per2.setBirthMonth(scan.nextInt());
		per2.setBirthYear(scan.nextInt());
		per2.getAge();

		let.countingL(per2.getName(),per2.getLastName());
		let.countingO(per2.getName(),per2.getLastName());
		let.countingV(per2.getName(),per2.getLastName());
		let.countingE(per2.getName(),per2.getLastName());
		let.countingS(per2.getName(),per2.getLastName());
		System.out.printf("%s %s %d/%d/%d\n",per2.getName(),per2.getLastName(),per2.getBirthDay(),per2.getBirthMonth(),per2.getBirthYear());
		System.out.printf("Calculate love compatibility between %s %s and %s %s\n",per1.getName(),per1.getLastName(),per2.getName(),per2.getLastName());
		System.out.printf("The love percentage is:");let.loveCounter();
		System.out.printf("The zodiac compatibility is:");
		zo1.somPong(zo1.ZodiacFinder(per1.getBirthDay(), per1.getBirthMonth()), zo2.ZodiacFinder(per2.getBirthDay(), per2.getBirthMonth()));
		System.out.printf("\nWant to calculate your love with another person? (Y/N) ?\n");
		String choice = String.valueOf(scan.next());
		let.init();
	     if (choice.equalsIgnoreCase("n")) {
	    	 System.exit(0);
	    	 scan.close();
	     }
		
	
		
		
		}
	}

}
