package base;
/**
 * Initializes side length variables
 * @author keg
 *
 */
public class Triangle {
	private double side1;
	private double side2;
	private double side3;
	Triangle() {
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	/**
	 * @param side1
	 * @param side2
	 * @param side3
	 */
	public Triangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public double getSide1() {
		return side1;
	}
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public double getSide2() {
		return side2;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	public double getSide3() {
		return side3;
	}
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	/**
	 * Returns the perimeter of the triangle
	 * @return
	 */
	double getPerimeter(){
		return side1 + side2 + side3;
	}
	/**
	 * Returns the area of the triangle based on a formula using half the perimeter
	 * @return
	 */
	double getArea(){
		double P = getPerimeter()/2;
		return Math.sqrt(P*(P-side1)*(P-side2)*(P-side3));
	}
	/**
	 * Returns a string describing triangle side lengths
	 */
	@Override
	public String toString() {
		return "side 1 is" + side1 + "side 2 is" + side2 + "side 3 is" + side3;
	}
	

}
