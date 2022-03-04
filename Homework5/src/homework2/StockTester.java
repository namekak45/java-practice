//supawit itthisiriwet 
//6209650370
package homework2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;



public class StockTester {
		
		static File available = new File("available.txt");
		static File runout = new File("runout.txt");

	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		System.out.printf("Please input file name\n");
		String answer = scan.nextLine();
		loadStockFile(answer);
		scan.close();
	}
	public static void loadStockFile(String fileName)  {
		
		try{ 	
				PrintWriter pw = new PrintWriter(runout);
				PrintWriter pw2 = new PrintWriter(available);
				Scanner scan = new Scanner (new File(fileName));
		while (scan.hasNextLine()) {
		try{	
			String stockDetail = scan.nextLine();
				StockItem stock = new StockItem(stockDetail);
				if(stock.getAmount()<=0) {
					pw.printf("%s;%d\n",stock.getName(),stock.getAmount());
				} else if (stock.getAmount()>0) {
					pw2.printf("%s;%d\n",stock.getName(),stock.getAmount());
				}
				
			}
		  catch (InvalidDataException e) {
			
			 	System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
				System.out.println(e.getLocalizedMessage());
		}
		
	}
					pw.close();
					pw2.close();
					scan.close();
} 	catch (FileNotFoundException e1) {
	
		System.out.println("file not found ");
		main(null);
				} 
		}
}

