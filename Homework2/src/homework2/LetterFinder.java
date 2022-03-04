//6209650370
//Supawit itthisiriwet
package homework2;

public class LetterFinder {
	private int sumL,sumO,sumV,sumE,sumS;
	private int sum1,sum2,sum3,sum4,sum5,sum6,sum7,sum8,sum9,sum10,love;
	private String letterL,letterO,letterV,letterE,letterS,sum11;
	public void init() {
		sumL=0;
		sumO=0;
		sumV=0;
		sumE=0;
		sumS=0;
		sum1=0;
		sum2=0;
		sum3=0;
		sum4=0;
		sum5=0;
		sum6=0;
		sum7=0;
		sum8=0;
		sum9=0;
		sum10=0;
		love=0;
		
	}
	
	public int countingL(String l,String c) {
		l = l.toLowerCase();
		c = c.toLowerCase();
		letterL = l+c;
		for (int i=0;i<letterL.length();i++) {
			if(letterL.charAt(i)=='l') {
				sumL++;
										}
			}
		return sumL;
	}
	public int countingO(String o,String x) {
		o = o.toLowerCase();
		x = x.toLowerCase();
		letterO = o+x;
		for (int i=0;i<letterO.length();i++) {
			if(letterO.charAt(i)=='o') {
				sumO++;
										}
			}
	return sumO;
	}
	public int countingV(String v,String p) {
		v = v.toLowerCase();
		p = p.toLowerCase();
		letterV = v+p;
		for (int i=0;i<letterV.length();i++) {
			if(letterV.charAt(i)=='v') {
				sumV++;
										}
			}
		
	return sumV;
	}
	public int countingE(String e,String h) {
		e= e.toLowerCase();
		h = h.toLowerCase();
		letterE = e+h;
		for (int i=0;i<letterE.length();i++) {
			if(letterE.charAt(i)=='e') {
				sumE++;
				
										}
			}
		
	return sumE;
	}
	public int countingS(String s,String k) {
		s = s.toLowerCase();
		k = k.toLowerCase();
		letterS = s+k;
		for (int i=0;i<letterS.length();i++) {
			if(letterS.charAt(i)=='s') {
				sumS++;
				
										}
			}
		
	return sumS;
	}
	
	public void check() {
		System.out.printf("%d %d %d %d %d\n",sum5(),sum6(),sum7(),sum8(),sum9());
	}
	public String loveCounter2() {
		Integer.toString(sum8());
		  Integer.toString(sum9());
        Integer.toString(sum10());
        sum11 = String.valueOf(sum8)+String.valueOf(sum9);
       return sum11;
	}
	public int sum1() {
		sum1 =sumL + sumO;
		return sum1;
	}
	public int sum2() {
		sum2 = sumO + sumV;
		return sum2;
	}
	public int sum3() {
		sum3 = sumV + sumE;
		return sum3;
	}
	public int sum4() {
		sum4 = sumE + sumS;
		return sum4;
	}
	public int sum5() {
		 sum5 = sum1()+sum2();
		return sum5;
	}
	public int sum6() {
		sum6 = sum2() + sum3();
		return sum6;
	}
	public int sum7() {
		sum7 = sum3() + sum4();
		return sum7;
	}
	public int sum8() {
		sum8 = sum5() + sum6();
		return sum8;
	}
	public int sum9() {
		sum9 = sum6()+ sum7();
		return sum9;
	}
	public int sum10() {
		sum10= sum8()  + sum9();
		return sum10;
	}
	public void loveCounter() {
		sum1();
		sum2();
		sum3();
		sum4();
		sum5();
		sum6();
		sum7();
		sum8();
		if (sum8()>9){ 
			
			sum9();
			sum10();
			love = sum10();
			System.out.printf("%d\n",love);
		} else {
		loveCounter2();
			System.out.printf("%s\n",loveCounter2());
		}
		
	}

}
