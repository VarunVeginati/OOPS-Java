public class Rectangle extends Shape{
    public int length;
    public int breadth;

    public Rectangle(String color, int length, int breadth) {
        super(color);
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double area() {
        return this.length * this.breadth;
    }

    @Override
    public String toString() {
        return ("Rectangle has color " + super.getColor() + " and has an area of " + this.area());
    }
}