package geometry;

public class Donut extends Circle {
	private int innerRadius;
	private boolean selected;
	
	public Donut() {}
	
	public Donut(int radius, Point center, int innerRadius) {
		super(radius, center);
		this.innerRadius = innerRadius;
	}
	
	public Donut(int radius, Point center, int innerRadius, boolean selected) {
		this(radius, center, innerRadius);
		this.selected = selected;
	}
	
	public int getInnerRadius() {
		return innerRadius;
	}

	public void setInnerRadius(int innerRadius) {
		this.innerRadius = innerRadius;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	@Override
	public boolean contains(int x, int y) {
		return super.contains(x, y) && center.distance(new Point(x, y)) >= innerRadius;
	}
	
	@Override
	public boolean contains(Point p) {
		return contains(p.getX(), p.getY());
	}
	
	@Override
	public double area() {
		return super.area() - (innerRadius*innerRadius*Math.PI);
 	}
	
	@Override
	public String toString() {
		return super.toString() + ", innerRadius: " + innerRadius;
 	}
	
	@Override 
	public boolean equals(Object o) {
		if(o instanceof Donut) {
			Donut temp = (Donut) o;
			if(getCenter().equals(temp.getCenter()) && getRadius() == temp.getRadius() &&
					innerRadius == temp.getInnerRadius()) {
				return true;
			}
		}
		return false;
	}
}
