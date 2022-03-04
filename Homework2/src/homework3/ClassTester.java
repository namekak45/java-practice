//6209650370
//Supawit itthisiriwet
package homework3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ClassTester {

	public static void main(String[] args) throws IOException {
			
			FileWriter fW = new FileWriter("test.txt");
			PrintWriter pW = new PrintWriter(fW);
			pW.print("Some String");
			pW.close();
		

	}

}
