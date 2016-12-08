package task8.visitors;

import task8.figures.Circle;
import task8.figures.Rectangle;
import task8.figures.Triangle;
import task8.utile.Point2D;

public class AreaVisitor implements IVisitor{
	private static final String outputFormat = "S=%.2f";

	@Override
	public void visit(Circle c) {
		double area = Math.PI*c.getRadius()*c.getRadius();
		System.out.println(String.format(outputFormat, area));
		
	}

	@Override
	public void visit(Triangle t) {
		//by Geron
		double a = Point2D.distance(t.getApex1(), t.getApex2());
		double b = Point2D.distance(t.getApex2(), t.getApex3());
		double c = Point2D.distance(t.getApex3(), t.getApex1());
		double p = (a + b + c) / 2.0;
		double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		System.out.println(String.format(outputFormat, area));
		
	}

	@Override
	public void visit(Rectangle r) {
		double area = r.getHeight() * r.getWidth();
		System.out.println(String.format(outputFormat, area));
		
	}
	
}
