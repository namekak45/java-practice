//6209650370
//Supawit itthisiriwet
package homework3;

import java.util.Random;

public class ClassList {
	private String filename;
	private int numberOfStudents;
	private int [] numberOfStudentsWithGrade = new int  [7];
	private int studentId;
	
	public ClassList(String x,int n) {
		
	}
	public void generateStudentRecordToFile() {
		Random ran = new Random();
	    for (int i=0;i<9;i++) {
	    	studentId=ran.nextInt(9)+1; 
	    	System.out.printf("%d", studentId);
	    }
	}
	  
	public int countGrade(String c,int o) {
		return studentId;
	}
}
