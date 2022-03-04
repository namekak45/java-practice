//supawit itthisiriwet 
//6209650370
package homework1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ConsoleSurveyReader {

	public static void main(String[] args) {
		processResult("console.txt");

	}
	
	public static void processResult(String fileName) {
			int  ps4=0,ntds=0,both=0,answer =0,none=0;
		try (Scanner scan = new Scanner (new File (fileName));){
			while(scan.hasNext()) {
				
				String counter = scan.next();
				 if (counter.equalsIgnoreCase("playstation4")) {
					 ps4++;
					 answer++;
					 
				 } else if (counter.equalsIgnoreCase("both")) {
					 both++;
					 answer++;
					 
				 } else if (counter.equalsIgnoreCase("none")) {
					 none++;
					 answer++;
					 
				 } else if (counter.equalsIgnoreCase("switch")) {
					 ntds++;
					 answer++;
					 
				 }
				
			} 
			System.out.printf("Total answers   \t\"%d\"\n",answer);
			System.out.printf("Select Playstation 4 \t\"%d\"\t= %.2f percentage\n",ps4,(float)(ps4*100/answer));
			System.out.printf("Select Swtich \t\t\"%d\"\t= %.2f percentage\n",ntds,(float)(ntds*100/answer));
			System.out.printf("Select none \t\t\"%d\"\t= %.2f percentage\n",none,(float)(none*100/answer));
			System.out.printf("Select both \t\t\"%d\"\t= %.2f percentage\n",both,(float)(both*100/answer));
			

		} catch (FileNotFoundException e) {
		   System.out.printf("File console.txt doesn't exist !");
		   System.exit(0);
		} 
	}
}
