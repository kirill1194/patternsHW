package task8.figures;

import task8.utile.Point2D;
import task8.visitors.IVisitor;

public class Circle implements IFigure {
	private Point2D center;
	private int radius;
	
	public Point2D getCenter() {
		return center;
	}

	public void setCenter(Point2D center) {
		this.center = center;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);

	}

}
