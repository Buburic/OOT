package geometry;

public class Line {
	private Point startPoint;
	private Point endPoint;
	private boolean selected;
	
	public Line() {}
	
	public Line(Point startPoint, Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}
	
	public Line(Point startPoint, Point endPoint, boolean selected) {
		this(startPoint, endPoint);
		this.selected = selected;
	}
	
	public Point getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}

	public Point getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	public double lenght() {
		return startPoint.distance(endPoint);
	}
	
	@Override
	public String toString() {
		return startPoint + "--->" + endPoint;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Line) {
			Line temp = (Line) o;
			if (this.startPoint.equals(temp.getStartPoint()) && this.endPoint.equals(temp.getEndPoint())) {
				return true;
			}
		}
		return false;
	}
}
