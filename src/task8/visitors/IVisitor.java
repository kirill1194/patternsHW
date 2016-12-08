package task8.visitors;

import task8.figures.Circle;
import task8.figures.Rectangle;
import task8.figures.Triangle;

public interface IVisitor {
	public void visit(Circle c);
	public void visit(Triangle t);
	public void visit(Rectangle r);
}
