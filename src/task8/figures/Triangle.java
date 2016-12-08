package task8.figures;

import task8.utile.Point2D;
import task8.visitors.IVisitor;

public class Triangle implements IFigure {
	private Point2D apex1;
	private Point2D apex2;
	private Point2D apex3;
	
	public Point2D getApex1() {
		return apex1;
	}

	public void setApex1(Point2D apex1) {
		this.apex1 = apex1;
	}

	public Point2D getApex2() {
		return apex2;
	}

	public void setApex2(Point2D apex2) {
		this.apex2 = apex2;
	}

	public Point2D getApex3() {
		return apex3;
	}

	public void setApex3(Point2D apex3) {
		this.apex3 = apex3;
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);

	}

}
