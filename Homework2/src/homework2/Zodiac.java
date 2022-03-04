package homework2;

//6209650370
//Supawit itthisiriwet
public class Zodiac {
	
	private String sign;
	private String sign1 ="Capricornus",sign2="Aquarius",sign3="Pisces",sign4="Aries",sign5="Taurus",sign6="Gemini";
	private String sign7 ="Cancer",sign8="Leo",sign9="Virgo",sign10="Libra",sign11="Scorpio",sign12="Sagitarius";
public String ZodiacFinder(int day,int month) {

	if((month == 1) && (day <= 19) || (month == 12) && (day >= 20)) {
		sign = sign1;
		} else if((month == 1)|| (month == 2) && (day <= 19)) {
		sign = sign2;
		} else if((month == 2) || (month == 3) && (day <= 19)) {
		sign = sign3;
		} else if((month == 3) || (month == 4) && (day <= 19)) {
		sign = sign4;
		} else if((month == 4) || (month == 5) && (day <= 19)) {
		sign = sign5;
		} else if((month == 5) || (month == 6) && (day <= 19)) {
		sign = sign6;
		} else if((month == 6) || (month == 7) && (day <= 19)) {
		sign = sign7;
		} else if((month == 7) || (month == 8) && (day <= 19)) {
		sign = sign8;
		} else if((month == 8) || (month == 9) && (day <= 19)) {
		sign = sign9;
		} else if((month == 9) || (month == 10) && (day <= 19)) {
		sign = sign10;
		} else if((month == 10) || (month == 11) && (day <= 19)) {
		sign = sign11;
		} else if(month == 12) {
		sign = sign12;
		}
	return sign;

					}
		public void somPong(String a,String b) {
			if((a=="Capricornus")&&(b=="Leo")||(a=="Capricornus")&&(b=="Cancer")) {
				System.out.printf("Bad");
			} else if ((a=="Aquarius")&&(b=="Cancer")||(a=="Aquarius")&&(b=="Leo")||(a=="Aquarius")&&(b=="Scorpio")) {
				System.out.printf("Bad");
			} else if ((a=="Pisces")&&(b=="Leo")||(a=="Pisces")&&(b=="Libra")||(a=="Pisces")&&(b=="Aquarius")) {
				System.out.printf("Bad");
			}else if ((a=="Aries")&&(b=="Cancer")||(a=="Aries")&&(b=="Virgo")) {
				System.out.printf("Bad");
			}else if ((a=="Taurus")&&(b=="Leo")||(a=="Taurus")&&(b=="Libra")) {
				System.out.printf("Bad");
			}else if ((a=="Gemini")&&(b=="Gemini")||(a=="Gemini")&&(b=="Cancer")||(a=="Gemini")&&(b=="Scorpio")) {
				System.out.printf("Bad");
			}else if ((a=="Cancer")&&(b=="Aries")||(a=="Cancer")&&(b=="Sagitarius")||(a=="Cancer")&&(b=="Aquarius")) {
				System.out.printf("Bad");
			}else if ((a=="Leo")&&(b=="Capricornus")||(a=="Leo")&&(b=="Taurus")) {
				System.out.printf("Bad");
			}else if ((a=="Virgo")&&(b=="Aries")||(a=="Virgo")&&(b=="Libra")) {
				System.out.printf("Bad");
			}else if ((a=="Libra")&&(b=="Virgo")||(a=="Libra")&&(b=="Taurus")||(a=="Libra")&&(b=="Pisces")) {
				System.out.printf("Bad");
			}else if ((a=="Scorpio")&&(b=="Aquarius")||(a=="Scorpio")&&(b=="Gemini")||(a=="Scorpio")&&(b=="Leo")) {
				System.out.printf("Bad");
			}else if ((a=="Sagitarius")&&(b=="Cancer")) {
				System.out.printf("Bad");
			} else if((a==b)||(b==a)){
				System.out.printf("Good");
			} else {
				System.out.printf("Good");
			}
			
		}

}
