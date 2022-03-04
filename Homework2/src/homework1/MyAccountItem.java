//6209650370
//Supawit itthisiriwet
package homework1;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class MyAccountItem {
	public void start() {
		
		while(true) {
		Scanner scan = new Scanner(System.in);
		
		NewAccount newac = new NewAccount();
		System.out.printf("\nPlease input option.\n");
		System.out.printf("Put \"I\" to make new account\n");
		System.out.printf("Put \"N\" to add new income/outcome to list \n");
		System.out.printf("Put \"F\" to search income/outcome in list\n");
		System.out.printf("Put \"C\" to check balance\n");
		System.out.printf("Put \"X\" to close this program \n");
		String choice = String.valueOf(scan.next());
		if(choice.equalsIgnoreCase("i")) {
			System.out.printf("Welcome to new accounting program\n");
			System.out.printf("Please insert your first name\n");
			newac.setFirstName(scan.next());
			System.out.printf("Please insert your last name\n");
			newac.setLastName(scan.next());
			System.out.printf("Welcome  %s %s \tyour account number is  %d", newac.getFirstName(),newac.getLastName(),newac.generateNumber());
										}
		else if (choice.equalsIgnoreCase("n")) {
			System.out.printf("\"+\" to add Income\n");
			System.out.printf("\"-\" to add Outcome\n");
			String choice2 = String.valueOf(scan.next());
			if (choice2.equalsIgnoreCase("+")) {
				System.out.printf("Please insert income name\n");
				setInName(scan.next());
				getInName();
				System.out.printf("Please insert income\n");
				setIncome(scan.nextDouble());
				getIncome();
				returnCountIn();
				case1();
												}
			else if (choice2.equalsIgnoreCase("-")) {
				System.out.printf("Please insert Outcome name\n");
				setOutName(scan.next());
				getOutName();
				System.out.printf("Please insert outcome\n");
				setOutcome(scan.nextDouble());
				getOutcome();
				returnCountOut();
				case2();
											}
			else {
				System.out.printf("invalid input, please try again");
			}
														}
		else if (choice.equalsIgnoreCase("f")) {
			System.out.printf("\"+\" to search Income\n ");
			System.out.printf("\"-\" to search Outcome\n");
			String choice3 = String.valueOf(scan.next());
			if (choice3.equalsIgnoreCase("+")) {
				showIn();
			}
			else if (choice3.equalsIgnoreCase("-")) {
				showOut();
			}
			else {
				System.out.printf("invalid input, please try again");
			}
												}
		else if (choice.equalsIgnoreCase("c")) {
			setBalance();
			getBalance1();
			getBalance2();
			System.out.printf("Total income\t");
			System.out.printf("= %.2f baht\t",getBalance1());
			System.out.printf("Total outcome\t");
			System.out.printf("= %.2f baht\t\n",getBalance2());
			System.out.printf("Total money left =\t%.2f baht\n",getFinalBalance() );
												}
		else if (choice.equalsIgnoreCase("x")) {
			scan.close();
			System.exit(0);
			
														}
		else {
			System.out.printf("invalid input, please try again");
		}
		
		}
						}
	private int countIn=0,countOut=0,x=0,o=0;
	private double balance1,balance2,balance3;
	private double [] expenseItems = new double [100];
	private double [] receiveItems = new double [100];
	private String [] receiveNames  = new String [100];
	private String [] expenseNames  = new String [100];
	GregorianCalendar gcal = new GregorianCalendar();
	
		public void caseIn() {
		
		}
		public void caseOut() {
			
		}
		public void setInName(String in) {
			receiveNames[countIn] = in;
		}
		public String getInName() {
			return receiveNames[countIn];
		}
		public void setOutName(String out) {
			expenseNames[countOut] = out;
		}
		public String getOutName() {
			return expenseNames[countOut];
		}
		public void setIncome(double gin) {
			receiveItems[countIn] = gin;
		}
		public double getIncome() {
			return receiveItems[countIn];
		}
		public void setOutcome(double gout) {
			expenseItems[countOut] = gout;
		}
		public double getOutcome() {
			return expenseItems[countOut];
		}
		public int returnCountIn() {
			countIn++;
			return countIn;
		}
		public int returnCountOut() {
			countOut++;
			return countOut;
		}
		public void showIn () {
			System.out.printf("Found %d list\n",countIn);
			for (int si=0; si<countIn;si++) {
				
				System.out.printf("%td %<tB %<tY,---%s amount +%.2f baht\n",gcal,receiveNames[si],receiveItems[si]);
			}
		}	
		public void showOut () {
			System.out.printf("Found %d list\n",countOut);
				for (int so=0; so<countOut;so++) {
					
					System.out.printf("%td %<tB %<tY,---%s amount -%.2f baht\n",gcal,expenseNames[so],expenseItems[so]);
					
				}
		}
		public int case1() { 
		System.out.printf("%td %<tB %<tY,---%s amount +%.2f baht\n",gcal,receiveNames[x],receiveItems[x]);
		x+=1;
		return x;
		}
		public int case2() { 
		System.out.printf("%td %<tB %<tY,---%s amount -%.2f baht\n",gcal,expenseNames[o],expenseItems[o]);
		o+=1;
		return o;		
		}
		public void setBalance() {
			for (int si=0; si<countIn;si++) {
				balance1	 +=  receiveItems[si];
				}
			for (int so=0; so<countOut;so++) {
				balance2     +=  expenseItems[so];
			}
		}
		public double getBalance1() {
			return balance1;
		}
		public double getBalance2() {
			return balance2;
		}
		public double getFinalBalance() {
			balance3 = balance1-balance2;
			return balance3;
		}
		
}
