package geometry;

public class Point {
	private int x;
	private int y;
	private boolean selected;
	
	public Point() {}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(int x, int y, boolean selected) {
		this(x, y);
		this.selected = selected;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	public double distance(Point p) {
		int dx = x - p.x;
		int dy = y - p.y;
		return Math.sqrt(dx*dx + dy*dy);
	}
	
	@Override
	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Point) {
			Point temp = (Point) o;
			if (this.x == temp.getX() && this.y == temp.getY()) {
				return true;
			}
		}
		return false;
	}
	
	public boolean contains(int x, int y) {
		return this.distance(new Point(x, y)) <= 3;
	}
}
