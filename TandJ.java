import java.util.ArrayList;
import java.util.Scanner;

public class TandJ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cheeseLocation = scan.nextInt();
		int tomLocation = scan.nextInt();
		int tomMove = tomLocation - cheeseLocation;
		String trapLocation = scan.next();
		ArrayList<Integer> trap = new ArrayList<Integer>();
		ArrayList<Integer> jerryMove = new ArrayList<Integer>();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for(int i=1;i<=cheeseLocation;i++) {
		   temp.add(i);
		  
		}
		for(int i=0;i<trapLocation.length();i++) {
			if(trapLocation.charAt(i) == '1') {
				trap.add(i+1);
			}
		}
		for(int i:temp) {
			if(!trap.contains(i)) {
				jerryMove.add(i);
			}
		}
		for(int i:jerryMove) {
			System.out.printf("%d ",i);
		}
		
		if(jerryMove.size()<tomMove) {
			System.out.print("\n1");
		}
		if(jerryMove.size()>tomMove) {
			System.out.print("\n0");
		}
		if(jerryMove.size()==tomMove) {
			System.out.print("\n-1");
		}
	}

}
