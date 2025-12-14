package geometry;

public class Rectangle {
	private Point upperLeft;
	private int width;
	private int height;
	private boolean selected;
	
	public Rectangle() {}
	
	public Rectangle(Point upperLeft, int width, int height) {
		this.upperLeft = upperLeft;
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(Point upperLeft, int width, int height, boolean selected) {
		this(upperLeft, width, height);
		this.selected = selected;
	}
		
	public Point getUpperLeft() {
		return upperLeft;
	}

	public void setUpperLeft(Point upperLeft) {
		this.upperLeft = upperLeft;
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

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	public double area() {
		return width*height;
	}
	
	public double circumference() {
		return 2*width + 2*height;
	}
	
	@Override
	public String toString() {
		return this.upperLeft + ", width: " + this.width + ", height: " + this.height;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Line) {
			Rectangle temp = (Rectangle) o;
			if (this.width == temp.getWidth() && this.height == temp.getHeight()) {
				return true;
			}
		}
		return false;
	}
}
