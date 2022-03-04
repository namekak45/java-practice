/*

LANG: JAVA

COMPILER: JAVA

*/

/*

NAME: Supawit itthisiriwet

SID: 6209650370

*/
import java.util.ArrayList;
import java.util.Scanner;

public class DemonCube {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String demon = scan.nextLine();
		String[] test  = demon.split("(?=[A-Z])");
		int []demonPow = new int[6];
		for(int i=0;i<test.length;i++) {
			if(test[i].matches("Kamanue")){
				demonPow[0] += 60;
			}else if(test[i].matches("Rui")) {
				demonPow[1] += 74;
			}else if(test[i].matches("Mukago")) {
				demonPow[2] += 75;
			}else if(test[i].matches("Wakuraba")) {
				demonPow[3] += 78;
			}else if(test[i].matches("Rokuro")) {
				demonPow[4] += 80;
			}else if(test[i].matches("Enmu")) {
				demonPow[5] += 84;
			}
			
		
		}
		int highest = 0,index = 0;
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=5;j++) {
				if(demonPow[i]>demonPow[j]) {
					highest = demonPow[i];
					index = i;
				}
			}
		}
		if(index==0) {
			System.out.printf("Kamanue %d",highest);
		} else if (index==1) {
			System.out.printf("Rui %d",highest);
		}else if (index==2) {
			System.out.printf("Mukago %d",highest);
		}else if (index==3) {
			System.out.printf("Wakuraba %d",highest);
		}else if (index==4) {
			System.out.printf("Rokuro %d",highest);
		}else if (index==5) {
			System.out.printf("Enmu %d",highest);
		}

			scan.close();
	}
	
}
