//Supawit itthisiriwet
//6209650370
package homework3;

public class Ads {
	private String name,tag,mes1,mes2,mes3; 
	public void setName(String aName) {
		name = aName;
	}
	public String getName() {
		return name;
	}
	public void setTag(String aTag) {
		tag = aTag;
	}
	public String getTag() {
		return tag;
	}
	public void setMes1(String aMes1) {
		mes1 = aMes1;
	}
	public String getMes1 () {
		return mes1;
	}
	public void setMes2 (String aMes2) {
		mes2 = aMes2;
	}
	public String getMes2 () {
		return mes2;
	}
	public void setMes3 (String aMes3) {
		mes3 = aMes3;
	}
	public String getMes3 () {
		return mes3;
	}
	public void displayAd () {
		System.out.printf("\n'%s\n%s\n%s'\n\nTag:\t%s\nBy:\t%s\n ", getMes1(),getMes2(),getMes3(),getTag(),getName());
	}


}
