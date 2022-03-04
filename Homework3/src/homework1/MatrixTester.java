//supawit itthisiriwet
//6209650370
package homework1;

public class MatrixTester {

	public static void main(String[] args) {
		Matrix m1 = new Matrix(3,3,true);   
		Matrix m2 = new Matrix(3,3,true);   
		Matrix m3 = new Matrix (3,3,true);   
		Matrix m5 = new Matrix (2,3,true);      
		System.out.println("----- m1  -------------");   
		m1.printData();   
		System.out.println("----- m2 -------------");   
		m2.printData();   
		System.out.println("----- m1 + m2 -------------");  
		Matrix m4 = m1.plus(m2);   
		m4.printData();   
		System.out.println("----- m3 -------------");   
		m3.printData();   
		System.out.println("----- m1 x m3 -------------");   
		m4 = m1.multiply(m3);   
		m4.printData();   
		System.out.println("-----  m3 tranpose---------");   
		m4 = m3.transpose();   
		m4.printData();       
		System.out.println("----- m2 + m5 -------------");   
		m4 = m2.plus(m5);   
		System.out.println("----- m2 x m5 -------------");   
		m4 = m2.multiply(m5); 
		 
		 
	}

}
