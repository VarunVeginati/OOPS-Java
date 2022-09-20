public class Circle extends Shape{
    public double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public String toString() {
        return ("Circle has color " + super.getColor() + " and has an area of " + this.area());
    }
}