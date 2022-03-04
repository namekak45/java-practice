//Supawit itthisiriwet
//6209650370
package homework5;

public class SlopeFloor {
	private double radius,fric;
	private final double gravity = 9.8;
	public void setRadius (double aRadius) {
		radius = aRadius ;
	}
	public double getRadius () {
		return radius;
	}
	public void setFric(double aFric) {
		fric = aFric ;
		
	}
	public double reFric() {
		return fric;
	}
	public double getMinForce(Box box,double fric) {
		Double minForce = (box.getWeight()*gravity*Math.sin(Math.toRadians(getRadius())) + (fric*box.getWeight()*gravity*Math.cos(Math.toRadians(getRadius()))));
		return minForce;
		
	}

}
