//Supawit itthisiriwet
//6209650370
package homework2;

import java.util.Scanner;

public class Pokemon { 
	private String name,type,category ;
    private double weight; 
	
	Scanner scan = new Scanner (System.in);
	 public void setName(String aSetName) { 
		 name = aSetName;
	 }
	 public String getName () {
		 return name;
	 }
	 public void setType(String aSetType) {
		 type = aSetType;	
	 }
	 public String getType () {
		 return type;
	 }
	 public void setCate(String aSetCate) {
		 category = aSetCate;
	 }
	 public String getCate() {
		 return category;
	 }
	 public void setWeight (double aSetWeight) {
		 weight = aSetWeight;
	 }
	 public double getWeight () {
		 return weight;
	 }
	 public void printInfo() {
		 System.out.printf("Name: %s\nType: %s\nCategory: %s\nWeight: %.2f lbs\n\n", getName(),getType(),getCate(),getWeight());

	 }
	 
}
 