package git1;

public class TestCircle {
    public static void main(String[] args) {
    	Circle circle1=new Circle();
    	System.out.println("The area of the circle of radius "+circle1.getRadius()+" is "+circle1.getArea());
    	Circle circle2=new Circle();
    	circle2.setRadius(25);
    	System.out.println("The area of the circle of radius "+circle2.getRadius()+" is "+circle2.getArea());
    	Circle circle3=new Circle();
    	circle3.setRadius(125);
    	System.out.println("The area of the circle of radius "+circle3.getRadius()+" is "+circle3.getArea());
    	circle2.setRadius(100);
    	System.out.println("The area of the circle of radius "+circle2.getRadius()+" is "+circle2.getArea());
    }
}
class Circle{
	private double radius=1;
    Circle(){}
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return radius*radius*Math.PI;
	}
	public double getPerimeter() {
		return 2*radius*Math.PI;
	}
	
}