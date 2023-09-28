package herencia1;

public class cylinder extends Circle{

	private double height;
	
	public cylinder (double radius) {
		super(radius);
		this.height=1.0;
	}
	public cylinder(double radius, double height) {
		super(radius);
		this.height=height;
	}
	
	public cylinder(double radius, double height,String color) {
		super(radius, color);
		this.height=height;
	
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getVolume() {
		return getArea() * height;
	}
	
	@Override
    public String toString() {
        return "Cylinder [radius=" + getRadius() + ", color=" + getColor() + ", height=" + height + "]";
    }
}
