package task8.figures;

import task8.visitors.IVisitor;

public interface IFigure {
	public void accept(IVisitor visitor);
}
