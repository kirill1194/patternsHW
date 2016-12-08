package task8.figures;

import task8.utile.Point2D;
import task8.visitors.IVisitor;

public class Rectangle implements IFigure {
	private Point2D point;
	private int width;
	private int height;
	public Point2D getPoint() {
		return point;
	}
	public void setPoint(Point2D point) {
		this.point = point;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
		
	}
	
}
