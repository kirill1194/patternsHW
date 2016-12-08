package task8.visitors;

import task8.figures.Circle;
import task8.figures.Rectangle;
import task8.figures.Triangle;
import task8.utile.Point2D;

public class DrawVisitor implements IVisitor {
	private int x = 0;
	private int y = 0;
	public DrawVisitor(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public DrawVisitor() {
	}

	@Override
	public void visit(Circle c) {
		System.out.println(String.format(
				"Отрисовка круга от точки (%d ; %d) с радиусом %d", 
				this.x, this.y, c.getRadius()));

	}

	@Override
	public void visit(Triangle t) {
		double a = Point2D.distance(t.getApex1(), t.getApex2());
		double b = Point2D.distance(t.getApex2(), t.getApex3());
		double c = Point2D.distance(t.getApex3(), t.getApex1());
		System.out.println(String.format(
				"Отрисовка треугольника от точки (%d ; %d) со сторонами %f, %f и %f", 
				this.x, this.y, a, b, c));
	}

	@Override
	public void visit(Rectangle r) {
		System.out.println(String.format(
				"Отрисовка прямоуголльника от точки (%d ; %d) со сторонами %d и %d", 
				this.x, this.y, r.getHeight(), r.getWidth() ));

	}

}
