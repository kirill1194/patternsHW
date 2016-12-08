package task8.visitors;

import task8.figures.Circle;
import task8.figures.Rectangle;
import task8.figures.Triangle;
import task8.utile.Point2D;

public class PerimeterVisitor implements IVisitor {
	private static final String outputFormat = "P=%.2f";


	@Override
	public void visit(Circle c) {
		double perim = Math.PI * c.getRadius() * 2.0;
		System.out.println(String.format(outputFormat, perim));
	}

	@Override
	public void visit(Triangle t) {
		double a = Point2D.distance(t.getApex1(), t.getApex2());
		double b = Point2D.distance(t.getApex2(), t.getApex3());
		double c = Point2D.distance(t.getApex3(), t.getApex1());
		double perim = a + b + c;
		System.out.println(String.format(outputFormat, perim));
		
	}

	@Override
	public void visit(Rectangle r) {
		double perim = ( r.getHeight() + r.getWidth() ) * 2.0;
		System.out.println(String.format(outputFormat, perim));
	}

}
